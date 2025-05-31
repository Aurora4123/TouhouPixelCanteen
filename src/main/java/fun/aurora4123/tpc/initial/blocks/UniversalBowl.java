package fun.aurora4123.tpc.initial.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class UniversalBowl extends DeskBlock {
    @Override
    public @NotNull VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return Shapes.or(box(5, 1, 5, 6, 2, 11),
                box(10, 1, 5, 11, 2, 11),
                box(6, 1, 0, 10, 2, 11),
                box(6, 1, 5, 10, 2, 6),
                box(11, 2, 5, 12, 5, 11),
                box(5, 2, 4, 11, 5, 5),
                box(4, 2, 5, 5, 5, 11),
                box(5, 2, 11, 11, 5, 12),
                box(6, 0, 6, 10, 1, 10));
    }
}
