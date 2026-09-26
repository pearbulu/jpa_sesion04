package model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_categoria")
@Setter
@Getter
public class Categoria {
   private Integer idCategoria;
   private String descripcion;
   private LocalDateTime fecharegistro;
}
