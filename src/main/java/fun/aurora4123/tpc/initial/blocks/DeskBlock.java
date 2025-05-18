package fun.aurora4123.tpc.initial.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class DeskBlock extends Block {
    public DeskBlock() {
        super(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(1f,10f).noOcclusion().isRedstoneConductor((state, world, pos) -> false));
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
        return Shapes.or(box(4, 0, 4, 12, 2, 12),box(7, 0, 7, 9, 15, 9),box(0,14,0,16,16,16), box(7, 13, 2, 9, 14, 14), box(2, 13, 7, 14, 14, 9));
    }
    @Override
    public BlockPathTypes getBlockPathType(BlockState state, BlockGetter reader, BlockPos pos, Mob entity) {
        return BlockPathTypes.BLOCKED;
    }
    @Override
    public int getLightBlock(BlockState state, BlockGetter world, BlockPos pos) {
        return 0;
    }

}
