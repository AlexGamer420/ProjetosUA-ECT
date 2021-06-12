library ieee;
use ieee.std_logic_1164.all;

entity Dec2_4En_tb is
end Dec2_4En_tb;

architecture Stimulus of Dec2_4En_tb is 
	signal s_enable : std_logic;
	signal s_inputs : std_logic_vector(1 downto 0);
	signal s_outputs: std_logic_vector(3 downto 0);
begin

uut:	entity	work.Dec2_4En(Behavioral)
			port map(enable 	=> s_enable,
						inputs 	=> s_inputs,
						outputs	=> s_outputs);
						
						
	process
	begin
		s_enable <= '1';
		s_inputs <= "00";
		wait for 50 ns;
		s_inputs <= "01";
		wait for 70 ns;
		s_inputs <= "10";
		wait for 30 ns;
		s_inputs <= "11";
		wait for 50 ns;
	end process;
end Stimulus;