/*
 * Copyright (C) 2014 RAED
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package tn.mariages.entities;

/**
 *
 * @author RAED
 */
public class Paquet {

    public Paquet() {
    }

    public Paquet(String nomPaquet, String descPaquet, String shortDescPaquet, String imgPaquet, Double prixPaquet) {
        this.nomPaquet = nomPaquet;
        this.descPaquet = descPaquet;
        this.shortDescPaquet = shortDescPaquet;
        this.imgPaquet = imgPaquet;
        this.prixPaquet = prixPaquet;
    }

    public Paquet(int idPaquet, int idPrest, String nomPaquet, String descPaquet, String shortDescPaquet, String imgPaquet, Double prixPaquet) {
        this.idPaquet = idPaquet;
        this.idPrest=  idPrest;

        this.nomPaquet = nomPaquet;
        this.descPaquet = descPaquet;
        this.shortDescPaquet = shortDescPaquet;
        this.imgPaquet = imgPaquet;
        this.prixPaquet = prixPaquet;
    }
    
    
    
    private int idPaquet;
    private int idPrest;

    private String nomPaquet;
    private String descPaquet;
    private String shortDescPaquet;
    
    private String imgPaquet;
    
    private Double prixPaquet;

    public int getIdPaquet() {
        return idPaquet;
    }

    public void setIdPaquet(int idPaquet) {
        this.idPaquet = idPaquet;
    }

    public String getNomPaquet() {
        return nomPaquet;
    }

    public void setNomPaquet(String nomPaquet) {
        this.nomPaquet = nomPaquet;
    }

    public String getDescPaquet() {
        return descPaquet;
    }

    public void setDescPaquet(String descPaquet) {
        this.descPaquet = descPaquet;
    }

    public String getShortDescPaquet() {
        return shortDescPaquet;
    }

    public void setShortDescPaquet(String shortDescPaquet) {
        this.shortDescPaquet = shortDescPaquet;
    }

    public String getImgPaquet() {
        return imgPaquet;
    }

    public void setImgPaquet(String imgPaquet) {
        this.imgPaquet = imgPaquet;
    }

    public Double getPrixPaquet() {
        return prixPaquet;
    }

    public void setPrixPaquet(Double prixPaquet) {
        this.prixPaquet = prixPaquet;
    }

    

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Paquet other = (Paquet) obj;
        if (this.idPaquet != other.idPaquet) {
            return false;
        }
        return true;
    }

    
    public int getIdPrest() {
        return idPrest;
    }

    public void setIdPrest(int idPrest) {
        this.idPrest = idPrest;
    }

    @Override
    public String toString() {
        return "Paquet{" + "idPaquet=" + idPaquet + ", idPrest=" + idPrest + ", nomPaquet=" + nomPaquet + ", descPaquet=" + descPaquet + ", shortDescPaquet=" + shortDescPaquet + ", imgPaquet=" + imgPaquet + ", prixPaquet=" + prixPaquet + '}';
    }
   
}
