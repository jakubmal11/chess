package pl.qubcio.chess.entities.pieces;

import pl.qubcio.chess.entities.BasePiece;
import pl.qubcio.chess.entities.PieceType;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Pawn extends BasePiece implements Serializable {


    public Pawn(Integer posX, Integer posY, String imagePath) {
        super(PieceType.PAWN, posX, posY, imagePath);
    }
}
