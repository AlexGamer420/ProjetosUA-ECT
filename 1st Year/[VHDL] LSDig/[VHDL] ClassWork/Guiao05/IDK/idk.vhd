library ieee;
use ieee.std_logic_1164.all;

entity idk is
	port( SW	 		: in std_logic_vector(17 downto 0);
			CLOCK_50 : in std_logic;
			LEDR		: out std_logic_vector(17 downto 0);
			HEX0		: out std_logic_vector(6 downto 0);
			HEX1		: out std_logic_vector(6 downto 0));
end idk;

architecture shell of idk is
	signal s_clk2hz	: std_logic;
	signal s_count		: std_logic_vector(7 downto 0);
begin
	
u1: entity work.FreqDivider(v1)
		port map(clkIn => CLOCK_50, 
					k		=> X"017D7840"
					clkOut=>  s_clk2hz);

u2:	entity work.CounterLoadUpDown4(Behavioral)
		port map( clk    => s_clk2hz,
					 enable => SW(17),
					 reset  =>SW(15),
					 load	  => SW (14),
					 upDown => SW(16),
					 dataIn => SW( 7 downto 0),
					 count  => s_count);

u3:	entity work.Bin7SegDecoder(Behavioral)
			port map(binInput => s_count(7 downto 4),
						decOut_n => HEX1);

u3:	entity work.Bin7SegDecoder(Behavioral)
			port map(binInput => s_count(3 downto 0),
						decOut_n => HEX0);
		LEDR(7 downto 0 ) <= s_count;

end shell;