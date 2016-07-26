Para executar o Programa Exploracao Submarina
    deve-se:
    
    1 - Empacotar a pasta EntrevistaBuscape em um pacote jar
        ex: Teste.jar
    2 - Executar a classe Exploracao.java do pacote br.com.buscape;
        java -jar Teste.jar Exploracao

    obs: Deve-se ter algum java jre na maquina, a partir da versão 6.
         
    Saida Esperada
    ==============
    Submarino [Nome=SUBMARINO_1 x=0, y=0, z=0, pontoCardeal=NORTE] ----> Submarino [Nome=SUBMARINO_1 x=0, y=0, z=0, pontoCardeal=OESTE]
    Submarino [Nome=SUBMARINO_1 x=0, y=0, z=0, pontoCardeal=OESTE] ----> Submarino [Nome=SUBMARINO_1 x=-1, y=0, z=0, pontoCardeal=OESTE]
    Submarino [Nome=SUBMARINO_1 x=-1, y=0, z=0, pontoCardeal=OESTE] ----> Submarino [Nome=SUBMARINO_1 x=-1, y=0, z=0, pontoCardeal=NORTE]
    Submarino [Nome=SUBMARINO_1 x=-1, y=0, z=0, pontoCardeal=NORTE] ----> Submarino [Nome=SUBMARINO_1 x=-1, y=0, z=-1, pontoCardeal=NORTE]
    Submarino [Nome=SUBMARINO_1 x=-1, y=0, z=-1, pontoCardeal=NORTE] ----> Submarino [Nome=SUBMARINO_1 x=-1, y=0, z=-2, pontoCardeal=NORTE]
    Submarino [Nome=SUBMARINO_1 x=-1, y=0, z=-2, pontoCardeal=NORTE] ----> Submarino [Nome=SUBMARINO_1 x=-1, y=1, z=-2, pontoCardeal=NORTE]
    Submarino [Nome=SUBMARINO_1 x=-1, y=1, z=-2, pontoCardeal=NORTE] ----> Submarino [Nome=SUBMARINO_1 x=-1, y=2, z=-2, pontoCardeal=NORTE]
    Submarino [Nome=SUBMARINO_1 x=-1, y=2, z=-2, pontoCardeal=NORTE] ----> Submarino [Nome=SUBMARINO_1 x=-1, y=2, z=-1, pontoCardeal=NORTE]
    Submarino [Nome=SUBMARINO_1 x=-1, y=2, z=-1, pontoCardeal=NORTE] ----> Submarino [Nome=SUBMARINO_1 x=-1, y=2, z=0, pontoCardeal=NORTE]
    
    Submarino [Nome=SUBMARINO_2 x=0, y=0, z=0, pontoCardeal=NORTE] ----> Submarino [Nome=SUBMARINO_2 x=0, y=0, z=0, pontoCardeal=LESTE]
    Submarino [Nome=SUBMARINO_2 x=0, y=0, z=0, pontoCardeal=LESTE] ----> Submarino [Nome=SUBMARINO_2 x=1, y=0, z=0, pontoCardeal=LESTE]
    Submarino [Nome=SUBMARINO_2 x=1, y=0, z=0, pontoCardeal=LESTE] ----> Submarino [Nome=SUBMARINO_2 x=2, y=0, z=0, pontoCardeal=LESTE]
    Submarino [Nome=SUBMARINO_2 x=2, y=0, z=0, pontoCardeal=LESTE] ----> Submarino [Nome=SUBMARINO_2 x=2, y=0, z=0, pontoCardeal=NORTE]
    Submarino [Nome=SUBMARINO_2 x=2, y=0, z=0, pontoCardeal=NORTE] ----> Submarino [Nome=SUBMARINO_2 x=2, y=1, z=0, pontoCardeal=NORTE]
    Submarino [Nome=SUBMARINO_2 x=2, y=1, z=0, pontoCardeal=NORTE] ----> Submarino [Nome=SUBMARINO_2 x=2, y=2, z=0, pontoCardeal=NORTE]
    Submarino [Nome=SUBMARINO_2 x=2, y=2, z=0, pontoCardeal=NORTE] ----> Submarino [Nome=SUBMARINO_2 x=2, y=3, z=0, pontoCardeal=NORTE]
    Submarino [Nome=SUBMARINO_2 x=2, y=3, z=0, pontoCardeal=NORTE] ----> Submarino [Nome=SUBMARINO_2 x=2, y=3, z=-1, pontoCardeal=NORTE]
    Submarino [Nome=SUBMARINO_2 x=2, y=3, z=-1, pontoCardeal=NORTE] ----> Submarino [Nome=SUBMARINO_2 x=2, y=3, z=-2, pontoCardeal=NORTE]
    Submarino [Nome=SUBMARINO_2 x=2, y=3, z=-2, pontoCardeal=NORTE] ----> Submarino [Nome=SUBMARINO_2 x=2, y=3, z=-2, pontoCardeal=OESTE]
    Submarino [Nome=SUBMARINO_2 x=2, y=3, z=-2, pontoCardeal=OESTE] ----> Submarino [Nome=SUBMARINO_2 x=2, y=3, z=-2, pontoCardeal=SUL]
