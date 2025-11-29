package parcvehicule.heritage.tp;

public class VoitureElectrique extends Motorise{
	

	public VoitureElectrique(String modele, Moteur moteur, double capaciteBatterie) {
        super(modele, moteur, capaciteBatterie, 0);
    }
	 /**
	 * @param modele
	 * @param moteur
	 * @param niveauCarburant
	 * @param kmTotal
	 */
	public VoitureElectrique(String modele, Moteur moteur, double niveauCarburant, double kmTotal) {
		super(modele, moteur, niveauCarburant, kmTotal);
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param modele
	 */
	public VoitureElectrique(String modele) {
		super(modele);
		// TODO Auto-generated constructor stub
	}
	 @Override
	    public void refuel(double kWh) {
	        niveauCarburant += kWh;
	        System.out.println(modele + " recharge " 
	            + kWh + " kWh (niveau=" 
	            + niveauCarburant + ")");
	    }
   
	@Override
	public String toString() {
		return super.toString().replace("carburant", "batterie")+ " {Electrique}";
	}
	
	
}
