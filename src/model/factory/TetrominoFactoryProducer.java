package model.factory;

public class TetrominoFactoryProducer {
    /**
     * Use Static Method:
     * This method can be used without creating an instance of this class.
     *
     * Return Type:
     * It returns an object of the TetrominoFactory interface type.
     *
     * Argument:
     * Accepts a TetrominoType enum value to determine which factory to return.
     *
     * @param type The type of Tetromino for which the factory is requested.
     * @return A concrete factory implementing the TetrominoFactory interface.
     */
    public static TetrominoFactory getFactory(TetrominoType type) {
        return switch (type) {
            case I -> new ITetrominoFactory();
            case T -> new TTetrominoFactory();
            case L -> new LTetrominoFactory();
            case J -> new JTetrominoFactory();
            case S -> new STetrominoFactory();
            case Z -> new ZTetrominoFactory();
            case O -> new OTetrominoFactory();
        };
    }
}
