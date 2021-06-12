library ieee;
use ieee.std_logic_1164.all;

entity andgate is

	port(inp0 : in std_logic;
		  inp1 : in std_logic;
		  outp : out std_logic);

end andgate;

architecture behav of andgate is 
begin
	
	outp <= inp0 and inp1;

end behav;