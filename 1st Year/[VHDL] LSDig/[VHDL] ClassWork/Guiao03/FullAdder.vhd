library ieee;
use ieee.std_logic_1164.all;

entity FullAdder is 
	port(a,b,cin: in std_logic;
		  s,cout: out std_logic);
end FullAdder;

architecture Skrr of FullAdder is 
begin
	
	cout<= (b and cin) or (a and cin) or (a and b);
	s<= (a xor b xor cin);
	

end Skrr; 