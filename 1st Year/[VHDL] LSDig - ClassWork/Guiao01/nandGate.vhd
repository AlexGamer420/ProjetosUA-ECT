library ieee;
use ieee.std_logic_1164.all;

entity nandGate is

	port(a : in std_logic;
		  b :	in std_logic;
		  z : out std_logic);

end nandGate;

architecture struct of nandGate is 
	signal s_andOut : std_logic;

begin
	
	u1: entity work.andgate(behav)
			port map (inp0 => a,
						 inp1 =>b,
						 outp =>s_andOut);
	
	u2: entity work.notgate(behav)
			port map (inp => s_andOut,
						 outp =>z);
end struct;