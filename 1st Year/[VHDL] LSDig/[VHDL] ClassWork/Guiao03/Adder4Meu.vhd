library ieee;
use ieee.std_logic_1164.all;

entity Adder4Meu is 
	port(a0,b0,cin0,a1,b1,a2,b2,a3,b3: in std_logic;
		  cout0,cout1,cin1,cout2,cin2,cin3: buffer std_logic;
		  s0,s1,s2,s3,cout3: out std_logic);
end Adder4Meu;

architecture Skrr of Adder4Meu is 
begin
	
	cout0<= (b0 and cin0) or (a0 and cin0) or (a0 and b0);
	s0<= (a0 xor b0 xor cin0) or (a0 and b0 and cin0);
	
	cin1<= cout0;
	cout1<= (b1 and cin1) or (a1 and cin1) or (a1 and b1);
	s1<= (a1 xor b1 xor cin1) or (a1 and b1 and cin1);
	
	cin2<= cout1;
	cout2<= (b2 and cin2) or (a2 and cin2) or (a2 and b2);
	s2<= (a2 xor b2 xor cin2) or (a2 and b2 and cin2);
	
	cin3<= cout2;
	cout3<= (b3 and cin3) or (a3 and cin3) or (a3 and b3);
	s3<= (a3 xor b3 xor cin3) or (a3 and b3 and cin3);
	
	
end Skrr; 