<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER &quot;son aire=&quot;"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2defaut="" F2etat="inactif" F2lignes="" F2para=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param totalAffichages="1000" totalBoucles="5000000" epaisseurPoint="2" epaisseurLigne="2" maxBoucle="500000" nbDecimales="8" arrondiAuto="vrai"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="saisir_le_rayonR EST_DU_TYPE NOMBRE" code="1#NOMBRE#saisir_le_rayonR"/>
        <item algoitem="son_aire EST_DU_TYPE NOMBRE" code="1#NOMBRE#son_aire"/>
        <item algoitem="son_volume EST_DU_TYPE NOMBRE" code="1#NOMBRE#son_volume"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;saisir le rayon R&quot;" code="4#saisir le rayon R#0"/>
        <item algoitem="LIRE saisir_le_rayonR" code="2#saisir_le_rayonR#pasliste"/>
        <item algoitem="AFFICHER &quot;son aire=&quot;" code="4#son aire=#0"/>
        <item algoitem="son_aire PREND_LA_VALEUR 4*Math.PI*saisir_le_rayonR*saisir_le_rayonR" code="5#son_aire#4*Math.PI*saisir_le_rayonR*saisir_le_rayonR#pasliste"/>
        <item algoitem="AFFICHER son_aire" code="3#son_aire#0#pasliste"/>
        <item algoitem="AFFICHER &quot;         son volume=&quot;" code="4#         son volume=#0"/>
        <item algoitem="son_volume PREND_LA_VALEUR 4/3*Math.PI*pow(saisir_le_rayonR,3)" code="5#son_volume#4/3*Math.PI*pow(saisir_le_rayonR,3)#pasliste"/>
        <item algoitem="AFFICHER son_volume" code="3#son_volume#0#pasliste"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
