package fun.aurora4123.tpc.initial.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class StoolBlock extends DeskBlock {
    @Override
    public @NotNull VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return Shapes.or(box(10, 0, 10, 12, 4, 12),
                box(4, 0, 10, 6, 4, 12),
                box(10, 0, 4, 12, 4, 6),
                box(4, 0, 4, 6, 4, 6),
                box(3, 4, 3, 13, 6, 13),
                box(5, 1, 6, 6,2, 10),
                box(10, 1, 6, 11, 2, 10));
    }
}
