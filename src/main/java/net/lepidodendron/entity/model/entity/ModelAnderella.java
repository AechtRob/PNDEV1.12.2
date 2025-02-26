package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelAnderella extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer frontcarapace;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer legright4;
    private final AdvancedModelRenderer legleft4;
    private final AdvancedModelRenderer legright5;
    private final AdvancedModelRenderer legleft5;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer bookgill1;
    private final AdvancedModelRenderer bookgill3;
    private final AdvancedModelRenderer bookgill5;
    private final AdvancedModelRenderer bookgill2;
    private final AdvancedModelRenderer bookgill4;
    private final AdvancedModelRenderer bookgill6;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer tail;

    public ModelAnderella() {
        this.textureWidth = 20;
        this.textureHeight = 20;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 21.5F, -7.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, 0.0F, 0.0F, 4, 1, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(2.0F, 0.0F, 3.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.9599F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 3, 5, 0.0F, 0.0F, -3.0F, 2, 0, 4, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.0F, 0.0F, 3.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.9599F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 3, 5, -2.0F, 0.0F, -3.0F, 2, 0, 4, 0.0F, false));

        this.frontcarapace = new AdvancedModelRenderer(this);
        this.frontcarapace.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(frontcarapace);
        this.setRotateAngle(frontcarapace, 0.9599F, 0.0F, 0.0F);
        this.frontcarapace.cubeList.add(new ModelBox(frontcarapace, 10, 0, -2.0F, 0.0F, -2.0F, 4, 0, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.frontcarapace.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 0.6981F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 0.0F, 0.0F, -2.0F, 1, 0, 2, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.frontcarapace.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -0.6981F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -1.0F, 0.0F, -2.0F, 1, 0, 2, 0.0F, false));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-0.25F, 0.55F, 1.15F);
        this.body.addChild(legright);
        this.setRotateAngle(legright, 0.0F, -0.3054F, -0.0873F);
        this.legright.cubeList.add(new ModelBox(legright, 6, 11, -3.0F, 0.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(0.25F, 0.55F, 1.15F);
        this.body.addChild(legleft);
        this.setRotateAngle(legleft, 0.0F, 0.3054F, 0.0873F);
        this.legleft.cubeList.add(new ModelBox(legleft, 6, 11, 0.0F, 0.0F, 0.0F, 3, 2, 0, 0.0F, true));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-0.25F, 0.55F, 1.5F);
        this.body.addChild(legright2);
        this.setRotateAngle(legright2, 0.0F, -0.1309F, -0.0873F);
        this.legright2.cubeList.add(new ModelBox(legright2, 6, 11, -3.0F, 0.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(0.25F, 0.55F, 1.5F);
        this.body.addChild(legleft2);
        this.setRotateAngle(legleft2, 0.0F, 0.1309F, 0.0873F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 6, 11, 0.0F, 0.0F, 0.0F, 3, 2, 0, 0.0F, true));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(-0.25F, 0.55F, 1.9F);
        this.body.addChild(legright3);
        this.setRotateAngle(legright3, 0.0F, 0.0F, -0.0873F);
        this.legright3.cubeList.add(new ModelBox(legright3, 6, 11, -3.0F, 0.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(0.25F, 0.55F, 1.9F);
        this.body.addChild(legleft3);
        this.setRotateAngle(legleft3, 0.0F, 0.0F, 0.0873F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 6, 11, 0.0F, 0.0F, 0.0F, 3, 2, 0, 0.0F, true));

        this.legright4 = new AdvancedModelRenderer(this);
        this.legright4.setRotationPoint(-0.25F, 0.55F, 2.3F);
        this.body.addChild(legright4);
        this.setRotateAngle(legright4, 0.0F, 0.1745F, -0.0873F);
        this.legright4.cubeList.add(new ModelBox(legright4, 6, 11, -3.0F, 0.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legleft4 = new AdvancedModelRenderer(this);
        this.legleft4.setRotationPoint(0.25F, 0.55F, 2.3F);
        this.body.addChild(legleft4);
        this.setRotateAngle(legleft4, 0.0F, -0.1745F, 0.0873F);
        this.legleft4.cubeList.add(new ModelBox(legleft4, 6, 11, 0.0F, 0.0F, 0.0F, 3, 2, 0, 0.0F, true));

        this.legright5 = new AdvancedModelRenderer(this);
        this.legright5.setRotationPoint(-0.25F, 0.55F, 2.65F);
        this.body.addChild(legright5);
        this.setRotateAngle(legright5, 0.0F, 0.4363F, -0.0873F);
        this.legright5.cubeList.add(new ModelBox(legright5, 6, 11, -3.0F, 0.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legleft5 = new AdvancedModelRenderer(this);
        this.legleft5.setRotationPoint(0.25F, 0.55F, 2.65F);
        this.body.addChild(legleft5);
        this.setRotateAngle(legleft5, 0.0F, -0.4363F, 0.0873F);
        this.legleft5.cubeList.add(new ModelBox(legleft5, 6, 11, 0.0F, 0.0F, 0.0F, 3, 2, 0, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.25F, 4.0F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.2182F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 9, 10, -1.0F, 0.0F, 0.0F, 2, 1, 3, 0.01F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 13, 0.0F, -0.25F, 0.0F, 0, 1, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.125F, 1.1F, 2.75F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.4363F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 8, 14, -2.0F, -1.0F, -3.0F, 2, 1, 1, -0.01F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(2.5F, 0.85F, 3.45F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.4363F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 5, -2.0F, 0.0F, -3.0F, 1, 0, 3, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, 1.1F, 3.0F);
        this.body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.4363F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 8, 6, -2.0F, -1.0F, -3.0F, 2, 1, 3, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.5F, 0.85F, 3.45F);
        this.body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.4363F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 5, 1.0F, 0.0F, -3.0F, 1, 0, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.125F, 1.1F, 2.75F);
        this.body2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.4363F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 8, 14, 0.0F, -1.0F, -3.0F, 2, 1, 1, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, 1.1F, 3.0F);
        this.body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.4363F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 8, 6, 0.0F, -1.0F, -3.0F, 2, 1, 3, 0.01F, false));

        this.bookgill1 = new AdvancedModelRenderer(this);
        this.bookgill1.setRotationPoint(0.0F, 1.1F, 0.3F);
        this.body2.addChild(bookgill1);
        this.setRotateAngle(bookgill1, 1.309F, 0.0F, 0.0F);
        this.bookgill1.cubeList.add(new ModelBox(bookgill1, 0, 14, -2.0F, -0.5F, 0.0F, 4, 2, 0, 0.0F, false));

        this.bookgill3 = new AdvancedModelRenderer(this);
        this.bookgill3.setRotationPoint(0.0F, 1.1F, 1.3F);
        this.body2.addChild(bookgill3);
        this.setRotateAngle(bookgill3, 1.309F, 0.0F, 0.0F);
        this.bookgill3.cubeList.add(new ModelBox(bookgill3, 0, 14, -2.0F, -0.5F, 0.0F, 4, 2, 0, 0.0F, false));

        this.bookgill5 = new AdvancedModelRenderer(this);
        this.bookgill5.setRotationPoint(0.0F, 1.1F, 2.3F);
        this.body2.addChild(bookgill5);
        this.setRotateAngle(bookgill5, 1.309F, 0.0F, 0.0F);
        this.bookgill5.cubeList.add(new ModelBox(bookgill5, 0, 14, -2.0F, -0.5F, 0.0F, 4, 2, 0, 0.0F, false));

        this.bookgill2 = new AdvancedModelRenderer(this);
        this.bookgill2.setRotationPoint(0.0F, 1.1F, 0.8F);
        this.body2.addChild(bookgill2);
        this.setRotateAngle(bookgill2, 1.309F, 0.0F, 0.0F);
        this.bookgill2.cubeList.add(new ModelBox(bookgill2, 12, 2, -2.0F, -0.5F, 0.0F, 4, 2, 0, 0.0F, false));

        this.bookgill4 = new AdvancedModelRenderer(this);
        this.bookgill4.setRotationPoint(0.0F, 1.1F, 1.8F);
        this.body2.addChild(bookgill4);
        this.setRotateAngle(bookgill4, 1.309F, 0.0F, 0.0F);
        this.bookgill4.cubeList.add(new ModelBox(bookgill4, 12, 2, -2.0F, -0.5F, 0.0F, 4, 2, 0, 0.0F, false));

        this.bookgill6 = new AdvancedModelRenderer(this);
        this.bookgill6.setRotationPoint(0.0F, 1.1F, 2.8F);
        this.body2.addChild(bookgill6);
        this.setRotateAngle(bookgill6, 1.309F, 0.0F, 0.0F);
        this.bookgill6.cubeList.add(new ModelBox(bookgill6, 12, 2, -2.0F, -0.5F, 0.0F, 4, 2, 0, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.6F, 2.95F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.0873F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 0, 11, -1.0F, -0.525F, -0.25F, 2, 1, 2, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 16, 0.0F, -0.775F, 0.75F, 0, 1, 1, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.1F, 1.75F);
        this.body3.addChild(tail);
        this.setRotateAngle(tail, 0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 5, -0.5F, -0.5F, -0.25F, 1, 1, 5, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.2F, 0.0F);
        this.body.offsetY = 0.16F;
        this.body.offsetZ = 0.016F;
        this.body.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -2.0F;
        this.body.offsetX = 0.6F;
        this.body.rotateAngleY = (float)Math.toRadians(220);
        this.body.rotateAngleX = (float)Math.toRadians(28);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 6.63F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.body.offsetY = 0.82F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        AdvancedModelRenderer[] Tail = {this.body2, this.body3, this.tail};
        AdvancedModelRenderer[] Gills = {this.bookgill1, this.bookgill2, this.bookgill3, this.bookgill4, this.bookgill5, this.bookgill6};

        if (isAtBottom || !e.isInWater()) {
            this.chainWave(Gills, 0.5F, 0.05f, -2, f2, 0F);
            //Left
            this.swing(legleft, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.swing(legleft2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.swing(legleft3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.swing(legleft4, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.swing(legleft5, 0.5F, -0.5F, false, 0.0F, -0.5F, f2, 0.3F);

            //Right:
            this.swing(legright, 0.5F, -0.5F, true, 0, -0.5F, f2, 0.3F);
            this.swing(legright2, 0.5F, -0.5F, true, 1.0F, -0.5F, f2, 0.3F);
            this.swing(legright3, 0.5F, -0.5F, true, 2.0F, -0.5F, f2, 0.3F);
            this.swing(legright4, 0.5F, -0.5F, true, 1.0F, -0.5F, f2, 0.3F);
            this.swing(legright5, 0.5F, -0.5F, true, 0.0F, -0.5F, f2, 0.3F);
        } else if (f3 > 0) {
            this.chainSwing(Tail, 0.1F, 0.2F, -2, f2, 1.0F);
            this.chainWave(Tail, 0.1F, 0.05f, -2, f2, 0F);
            this.bob(body, 0.0F, 0.0F, false, f2, 1);
            //Left
            this.swing(legleft, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.swing(legleft2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.swing(legleft3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.swing(legleft4, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.swing(legleft5, 0.5F, -0.5F, false, 0.0F, -0.5F, f2, 0.3F);

            //Right:
            this.swing(legright, 0.5F, -0.5F, true, 0, -0.5F, f2, 0.3F);
            this.swing(legright2, 0.5F, -0.5F, true, 1.0F, -0.5F, f2, 0.3F);
            this.swing(legright3, 0.5F, -0.5F, true, 2.0F, -0.5F, f2, 0.3F);
            this.swing(legright4, 0.5F, -0.5F, true, 1.0F, -0.5F, f2, 0.3F);
            this.swing(legright5, 0.5F, -0.5F, true, 0.0F, -0.5F, f2, 0.3F);
        } else {
            this.chainSwing(Tail, 0.2F, 0.08F, -2, f2, 0.5F);
            this.chainWave(Tail, 0.2F, 0.05f, -2, f2, 0.8F);
            this.bob(body, 0.2F, 0.1F, false, f2, 0.5F);
        }

    }
}
