package voiture;

public class MetaVoitureSport extends VoitureSport implements Surveillable {

    @Override
    public int surveiller(int limite){
        return limite - vitesse;
    }
}