library ieee;
use ieee.std_logic_1164.all;

entity notgate is

	port(inp : in std_logic;
		  
		  outp : out std_logic);

end notgate;

architecture behav of notgate is 
begin
	
	outp <= not inp;

end behav;