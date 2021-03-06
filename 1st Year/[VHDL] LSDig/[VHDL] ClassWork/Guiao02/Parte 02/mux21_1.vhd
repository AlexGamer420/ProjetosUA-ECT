library ieee;
use ieee.std_logic_1164.all;

entity mux21_1 is
	port (inputs : in std_logic_vector(1 downto 0);
			sel 	 : in std_logic;
			outMux : out std_logic);
end mux21_1;
	
	
architecture v1 of mux21_1 is
begin 
		outMux <= inputs(0) when sel = '0' else inputs(1);
end v1 ;
		
		
		
architecture v2 of mux21_1 is
begin 
	
	process(inputs, sel)
	begin
		if(sel ='0') then
			outMux <= inputs(0);
		else
			outMux <= inputs(1);
		end if;
	end process;
end v2;