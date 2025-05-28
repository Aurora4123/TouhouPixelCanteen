package fun.aurora4123.tpc.initial.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class UniversalDish extends DeskBlock {
    @Override
    public @NotNull VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return Shapes.or(box(4, 0, 4, 12, 1, 12),
                box(3, 1, 4, 4, 2, 12),
                box(12, 1, 4, 13, 2, 12),
                box(4, 1, 12, 12, 2, 13),
                box(4, 1, 3, 12, 2, 4));
    }
}
