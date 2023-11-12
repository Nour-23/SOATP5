package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import metier.Compte;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService
public class BanqueService {


@WebMethod
        double conversion(@WebParam  double  montant) {
            return montant*3.36;
        }
@WebMethod
        public Compte getCompte(@WebParam int code) {
    return new Compte(code, 0, new Date());
        }

       @WebMethod
       public List<Compte> getComptes() {
            List<Compte> comptes = new ArrayList<>();
            Compte c1 = new Compte(10,10.5,new Date());
            Compte c2 = new Compte(9,15.5,new Date());
            comptes.add(c1);
            comptes.add(c2);
            return comptes;
        }



    }


