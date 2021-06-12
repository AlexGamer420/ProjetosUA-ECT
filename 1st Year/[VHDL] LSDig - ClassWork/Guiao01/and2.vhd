library ieee;
use ieee.std_logic_1164.all;

entity and2 is

	port(inp0 : in std_logic;
		  inp1 : in std_logic;
		  outp : out std_logic);

end and2;

architecture behav of and2 is 
begin
	
	outp <= inp0 and inp1;

end behav;