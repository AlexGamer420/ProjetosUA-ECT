library IEEE;
use IEEE.STD_LOGIC_1164.all;

entity Dec24_demo is
port(enable : in std_logic;
	  inputs : in std_logic_vector(2 downto 0);
	 outputs : out std_logic_vector(3 downto 0));
end Dec24_demo;


architecture shell of Dec24_demo is

begin
	
ul: entity work.dec2_4En(v1)
	port map(enable => SW(2),
				inputs => SW(1 downto 0),
				outputs=> LEDR(3 downto 0));
end shell;