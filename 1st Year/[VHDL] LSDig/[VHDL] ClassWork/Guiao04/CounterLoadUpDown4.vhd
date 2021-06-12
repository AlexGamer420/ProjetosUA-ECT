library IEEE;
use IEEE.STD_LOGIC_1164.all;
use ieee.numeric_std.all;

entity CounterLoadUpDown4 is

port(clk    : in std_logic;
	  enable : in std_logic;
	  reset  : in std_logic;
	  load	: in std_logic;
	  upDown : in std_logic;
	  dataIn : in std_logic_vector(3 downto 0);
	  count  : out std_logic_vector(3 downto 0));
	  
end CounterLoadUpDown4;

architecture Behavioral of CounterLoadUpDown4 is
		signal s_count : unsigned(3 downto 0);
begin
	process(clk)
		begin
		if (rising_edge(clk)) then
			if(reset = '1') then
				s_count<= (others => '0');
			else 
				if(enable = '1') then
					if(load='1')  then
						s_count<= unsigned (dataIn);
					elsif (upDown ='0') then
						s_count <= s_count - 1; -- down
					else 
						s_count <= s_count + 1; -- up
							
					end if;
				end if;
			end if;
		end if;
	end process;
end Behavioral;