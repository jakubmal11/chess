package pl.qubcio.chess.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@Data
public abstract class BasePiece {
    public BasePiece(PieceType pieceType, Integer posX, Integer posY, String imagePath) {
        this.pieceType = pieceType;
        this.posX = posX;
        this.posY = posY;
        this.imagePath = imagePath;
    }

    @Id
    @GeneratedValue
    public Long id;

    @Column(name = "created_at")
    public Date createdAt;

    @Column(name = "updated_at")
    public Date updatedAt;

    @Column
    private PieceType pieceType;

    @Column
    private Integer posX;

    @Column
    private Integer posY;

    @Column
    private String imagePath;

}
