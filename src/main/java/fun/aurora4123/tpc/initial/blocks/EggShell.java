package fun.aurora4123.tpc.initial.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class EggShell extends Block implements EntityBlock {
    public EggShell() {
        super(Properties.of().sound(SoundType.GLASS).strength(1f,10f).noOcclusion().isRedstoneConductor((state, world, pos) -> false));
    }

    @Override
    public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
        return true;
    }
    @Override
    public VoxelShape getVisualShape(BlockState state, BlockGetter reader, BlockPos pos, CollisionContext context) {
        return Shapes.empty();
    }
    @Override
    public @NotNull VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return
                Shapes.or(
                        box(6, 1, 5, 10, 4, 6),
                        box(5, 1, 6, 6, 4, 10),
                        box(10,1,6,11,4,10),
                        box(6, 1, 10, 10, 4, 11),
                        box(6, 0, 6, 10, 1, 10));
    }
    @Override
    public BlockPathTypes getBlockPathType(BlockState state, BlockGetter reader, BlockPos pos, Mob entity) {
        return BlockPathTypes.BLOCKED;
    }
    @Override
    public int getLightBlock(BlockState state, BlockGetter world, BlockPos pos) {
        return 0;
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return null;
    }
}
