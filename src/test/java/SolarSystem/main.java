package SolarSystem;

public class main {
    public static void main(String[] args) {
        solarSystemBasics solarsys=new solarSystemBasics();
        solarsys.Sun="1";
        solarsys.Moon="2";
        solarsys.Planets="2";
        solarsys.Stars="10";

        //  ***********Feature Sun *****************
        //        **Feature Sun**
        FeatureSun Sun=new FeatureSun();
        Sun.name="panther";
        Sun.color="black";
        Sun.temp="-1223124kelvin";



     //   *******************Planet2************
        Planet2 Xaros=new Planet2();
        Xaros.name="LaLaLand";
        Xaros.color="Pink";
        Xaros.size="12345333m";
    }
}
