library ieee;
use ieee.std_logic_1164.all;
use IEEE.NUMERIC_STD.all;

entity SeqDetDemo is
port ( 	SW 	: in std_logic_vector(17 downto 0);
			KEY  : in std_logic_vector(3 downto 0);
			LEDR : out std_logic_vector(17 downto 0);
			CLOCK_50	: in std_logic);

end SeqDetDemo;

architecture tudo of SeqDetDemo is
	signal s_CLK: std_logic;
begin

u1:	entity work.SeqDetFSM(MealyArch)
			port map(reset	=> not KEY(1),
						clk	=> s_CLK,
						Xin	=> SW(17),
						Yout	=>	LEDR(17));

u2:	entity work.DebounceUnit(Behavioral)
			port map(refClk		=>	CLOCK_50,
						dirtyIn		=>	KEY(0),
						pulsedOut	=> s_CLK	);


end tudo;