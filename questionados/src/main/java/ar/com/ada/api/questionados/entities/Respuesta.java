package ar.com.ada.api.questionados.entities;

import javax.persistence.*;

@Entity
@Table(name = "respuesta")
public class Respuesta {

    @Id
    @Column(name = "respuesta_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer respuestaId;
    
    private String texto;

    @Column(name = "es_correcta")
    private boolean esCorrecta;

    @ManyToOne
    @JoinColumn(name = "pregunta_id", referencedColumnName = "pregunta_id")
    private Pregunta pregunta;



    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean getEsCorrecta() {
        return esCorrecta;
    }

    public void setEsCorrecta(boolean esCorrecta) {
        this.esCorrecta = esCorrecta;
    }

    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
        this.pregunta.agregarRespuesta(this);//relacion bidireccional
    }
}
