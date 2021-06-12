library ieee;
use ieee.std_logic_1164.all;

entity SeqDetFSM is
	port(reset	: 	in std_logic;
			clk	:	in std_logic;
			Xin	:	in std_logic;
			Yout	:	out std_logic);
end SeqDetFSM;

architecture MealyArch of SeqDetFSM is
	type state is (A,B,C,D);
	signal PS,NS : state;
begin
	sync_proc: process(clk)
	begin
	if (rising_edge(clk)) then
		if (reset ='1') then
			PS <= A;
		else
			PS <=NS;
		end if;
	end if;
	end process;

	comb_proc	: process(PS, Xin)
	begin 
		Yout <='0';
		case PS is
		when A =>
			if (Xin= '1') then NS <= B;
			else NS <= A;
			end if;
		when B =>
			if (Xin = '1') then NS <= B;
			else NS <= C;
			end if;
		when C=> 
		if (Xin = '1') then NS <= B;
			else NS <= D;
			end if;
		when D=> 
		if (Xin = '1') then
			NS <= B;
			Yout <= '1';
			else NS <=A;
			end if;
		when others =>
			NS <= A;
		end case;
		end process;
		
end MealyArch;
