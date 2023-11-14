<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER A"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2etat="inactif" F2defaut="" F2para="" F2lignes=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param epaisseurLigne="2" totalBoucles="5000000" maxBoucle="500000" epaisseurPoint="2" nbDecimales="8" arrondiAuto="vrai" totalAffichages="1000"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#A" algoitem="A EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#B" algoitem="B EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#C" algoitem="C EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Ecrire un nombre réel en A#0" algoitem="AFFICHER &quot;Ecrire un nombre réel en A&quot;"/>
        <item code="2#A#pasliste" algoitem="LIRE A"/>
        <item code="4#Ecrire un nombre réel en B#0" algoitem="AFFICHER &quot;Ecrire un nombre réel en B&quot;"/>
        <item code="2#B#pasliste" algoitem="LIRE B"/>
        <item code="4#Ecrire’un nombre réel en C#0" algoitem="AFFICHER &quot;Ecrire’un nombre réel en C&quot;"/>
        <item code="2#C#pasliste" algoitem="LIRE C"/>
        <item code="6#B>=A ET C>=B" algoitem="SI (B>=A ET C>=B) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="3#A#1#pasliste" algoitem="AFFICHER A"/>
            <item code="3#B#1#pasliste" algoitem="AFFICHER B"/>
            <item code="3#C#1#pasliste" algoitem="AFFICHER C"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
            <item code="9#sinon" algoitem="SINON">
                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                <item code="6#C>=A ET B>=C" algoitem="SI (C>=A ET B>=C) ALORS">
                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                    <item code="3#A#1#pasliste" algoitem="AFFICHER A"/>
                    <item code="3#C#1#pasliste" algoitem="AFFICHER C"/>
                    <item code="3#B#1#pasliste" algoitem="AFFICHER B"/>
                    <item code="8#finsi" algoitem="FIN_SI"/>
                    <item code="9#sinon" algoitem="SINON">
                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                        <item code="6#A>=B ET C>=A" algoitem="SI (A>=B ET C>=A) ALORS">
                            <item code="7#debutsi" algoitem="DEBUT_SI"/>
                            <item code="3#B#1#pasliste" algoitem="AFFICHER B"/>
                            <item code="3#A#1#pasliste" algoitem="AFFICHER A"/>
                            <item code="3#C#1#pasliste" algoitem="AFFICHER C"/>
                            <item code="8#finsi" algoitem="FIN_SI"/>
                            <item code="9#sinon" algoitem="SINON">
                                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                <item code="6#C>=B ET A>=C" algoitem="SI (C>=B ET A>=C) ALORS">
                                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                    <item code="3#B#1#pasliste" algoitem="AFFICHER B"/>
                                    <item code="3#C#1#pasliste" algoitem="AFFICHER C"/>
                                    <item code="3#A#1#pasliste" algoitem="AFFICHER A"/>
                                    <item code="8#finsi" algoitem="FIN_SI"/>
                                    <item code="9#sinon" algoitem="SINON">
                                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                        <item code="6#A>=C ET B>=A" algoitem="SI (A>=C ET B>=A) ALORS">
                                            <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                            <item code="3#C#1#pasliste" algoitem="AFFICHER C"/>
                                            <item code="3#A#1#pasliste" algoitem="AFFICHER A"/>
                                            <item code="3#B#1#pasliste" algoitem="AFFICHER B"/>
                                            <item code="8#finsi" algoitem="FIN_SI"/>
                                            <item code="9#sinon" algoitem="SINON">
                                                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                                <item code="6#B>=C ET A>=B" algoitem="SI (B>=C ET A>=B) ALORS">
                                                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                                    <item code="3#C#1#pasliste" algoitem="AFFICHER C"/>
                                                    <item code="3#B#1#pasliste" algoitem="AFFICHER B"/>
                                                    <item code="3#A#1#pasliste" algoitem="AFFICHER A"/>
                                                    <item code="8#finsi" algoitem="FIN_SI"/>
                                                </item>
                                                <item code="11#finsinon" algoitem="FIN_SINON"/>
                                            </item>
                                        </item>
                                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                                    </item>
                                </item>
                                <item code="11#finsinon" algoitem="FIN_SINON"/>
                            </item>
                        </item>
                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                    </item>
                </item>
                <item code="11#finsinon" algoitem="FIN_SINON"/>
            </item>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
