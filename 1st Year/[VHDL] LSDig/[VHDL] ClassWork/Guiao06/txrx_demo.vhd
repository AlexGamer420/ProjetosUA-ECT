library ieee;
use ieee.std_logic_1164.all;

entity txrx_demo is

    port(SW : in std_logic_vector(17 downto 0);
        KEY : in std_logic_vector(3 downto 0);
        LEDR: out std_logic_vector(17 downto 0));

end txrx_demo;


architecture behave of txrx_demo is

signal s_clk , s_data : std_logic;

begin

    s_clk <= not KEY(0);

    tx: entity work.rightShift(shift)
        port map(clk => s_clk,
                    sin => '0',
                    load=> SW(17),
                    din => SW(3 downto 0),
                    dout=> open,
                    so  => s_data); 

    rx: entity work.rightShift(shift)
        port map(clk => s_clk,
                    sin => s_data,
                    load=> '0',
                    din => "----",
                    dout=> LEDR(3 downto 0),
                    so  => open); 


end behave;