package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelCamanchia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer carapace;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer frontcarapace;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer legright4;
    private final AdvancedModelRenderer legleft4;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer legright5;
    private final AdvancedModelRenderer legleft5;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer bookgill1;
    private final AdvancedModelRenderer bookgill2;
    private final AdvancedModelRenderer bookgill3;
    private final AdvancedModelRenderer bookgill4;
    private final AdvancedModelRenderer bookgill5;
    private final AdvancedModelRenderer bookgill6;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer tail;

    public ModelCamanchia() {
        this.textureWidth = 32;
        this.textureHeight = 20;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 23.0F, -3.0F);


        this.carapace = new AdvancedModelRenderer(this);
        this.carapace.setRotationPoint(-0.0175F, -1.9054F, 1.0F);
        this.body.addChild(carapace);
        this.setRotateAngle(carapace, 0.0873F, 0.0F, 0.0F);
        this.carapace.cubeList.add(new ModelBox(carapace, 0, 0, -1.9825F, -0.0946F, -4.0F, 4, 1, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(2.75F, 1.0F, -2.0F);
        this.carapace.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 1.9635F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 11, -0.5F, -1.0F, -2.0F, 1, 2, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.7151F, 1.0F, -2.0F);
        this.carapace.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -1.9635F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 11, -0.5F, -1.0F, -2.0F, 1, 2, 4, 0.0F, true));

        this.frontcarapace = new AdvancedModelRenderer(this);
        this.frontcarapace.setRotationPoint(0.0175F, 0.1554F, -4.0F);
        this.carapace.addChild(frontcarapace);
        this.setRotateAngle(frontcarapace, -1.1781F, 0.0F, 0.0F);
        this.frontcarapace.cubeList.add(new ModelBox(frontcarapace, 11, 14, -2.0F, 0.0F, 0.0F, 4, 2, 1, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.0F, 2.0F, 0.0F);
        this.frontcarapace.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.3927F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 25, 9, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 11, 0.0F, -2.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.0F, 2.0F, 0.0F);
        this.frontcarapace.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.3927F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 25, 9, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 24, 11, -2.0F, -2.0F, 0.0F, 2, 1, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.frontcarapace.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.7854F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 23, 7, -1.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-0.2534F, -0.9497F, -2.0909F);
        this.body.addChild(legright);
        this.setRotateAngle(legright, 0.0F, -0.3054F, -0.0873F);
        this.legright.cubeList.add(new ModelBox(legright, 12, 2, -2.9995F, 0.0F, -0.0097F, 3, 2, 0, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(0.2534F, -0.9497F, -2.0909F);
        this.body.addChild(legleft);
        this.setRotateAngle(legleft, 0.0F, 0.3054F, 0.0873F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.225F, 0.0F, -0.725F);
        this.legleft.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 3.1416F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 12, 2, -2.7745F, 0.0F, -0.7153F, 3, 2, 0, 0.0F, false));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-0.2488F, -0.9501F, -1.7434F);
        this.body.addChild(legright2);
        this.setRotateAngle(legright2, 0.0F, -0.1309F, -0.0873F);
        this.legright2.cubeList.add(new ModelBox(legright2, 12, 2, -3.0021F, 0.0F, -0.0064F, 3, 2, 0, 0.0F, false));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(0.2488F, -0.9501F, -1.7434F);
        this.body.addChild(legleft2);
        this.setRotateAngle(legleft2, 0.0F, 0.1309F, 0.0873F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.1F, 0.0F, -0.75F);
        this.legleft2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 3.1416F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 12, 2, -2.9021F, 0.0F, -0.7436F, 3, 2, 0, 0.0F, false));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(-0.25F, -0.95F, -1.35F);
        this.body.addChild(legright3);
        this.setRotateAngle(legright3, 0.0F, 0.0F, -0.0873F);
        this.legright3.cubeList.add(new ModelBox(legright3, 12, 2, -3.0F, 0.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(0.25F, -0.95F, -1.35F);
        this.body.addChild(legleft3);
        this.setRotateAngle(legleft3, 0.0F, 0.0F, 0.0873F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, -0.75F);
        this.legleft3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 3.1416F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 12, 2, -3.0F, 0.0F, -0.75F, 3, 2, 0, 0.0F, false));

        this.legright4 = new AdvancedModelRenderer(this);
        this.legright4.setRotationPoint(-0.2429F, -0.9506F, -0.9397F);
        this.body.addChild(legright4);
        this.setRotateAngle(legright4, 0.0F, 0.1745F, -0.0873F);
        this.legright4.cubeList.add(new ModelBox(legright4, 12, 2, -3.0052F, 0.0F, -0.0114F, 3, 2, 0, 0.0F, false));

        this.legleft4 = new AdvancedModelRenderer(this);
        this.legleft4.setRotationPoint(0.2429F, -0.9506F, -0.9397F);
        this.body.addChild(legleft4);
        this.setRotateAngle(legleft4, 0.0F, -0.1745F, 0.0873F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.125F, 0.0F, -0.75F);
        this.legleft4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 3.1416F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 12, 2, -3.1302F, 0.0F, -0.7386F, 3, 2, 0, 0.0F, false));

        this.legright5 = new AdvancedModelRenderer(this);
        this.legright5.setRotationPoint(-0.2592F, -0.9492F, -0.6009F);
        this.body.addChild(legright5);
        this.setRotateAngle(legright5, 0.0F, 0.4363F, -0.0873F);
        this.legright5.cubeList.add(new ModelBox(legright5, 12, 2, -2.992F, 0.0F, 0.0047F, 3, 2, 0, 0.0F, false));

        this.legleft5 = new AdvancedModelRenderer(this);
        this.legleft5.setRotationPoint(0.2367F, -0.9512F, -0.6115F);
        this.body.addChild(legleft5);
        this.setRotateAngle(legleft5, 0.0F, -0.4363F, 0.0873F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.3F, 0.0F, -0.675F);
        this.legleft5.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 3.1416F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 12, 2, -3.317F, 0.0F, -0.6797F, 3, 2, 0, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.5F, 1.0F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.2182F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 5, -1.0F, 0.0F, 0.0F, 2, 1, 5, 0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(2.3056F, 1.1F, 2.0292F);
        this.body2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.4363F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 6, 7, -0.5F, -0.025F, 0.0F, 1, 0, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(2.3492F, 1.1F, 1.0301F);
        this.body2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 3.1416F, -0.0436F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 7, 5, -0.5F, 0.025F, -1.0F, 1, 0, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-2.3492F, 1.1F, 1.0301F);
        this.body2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 3.1416F, 0.0436F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 7, 5, -0.5F, 0.025F, -1.0F, 1, 0, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(2.3056F, 1.1F, 2.0292F);
        this.body2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.4363F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 22, 3, -2.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(2.3929F, 1.1F, 0.0311F);
        this.body2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.0436F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 16, 2, -2.0F, -1.0F, 0.0F, 2, 1, 2, -0.01F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-2.3929F, 1.1F, 0.0311F);
        this.body2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0436F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 16, 2, 0.0F, -1.0F, 0.0F, 2, 1, 2, -0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-2.3056F, 1.1F, 2.0292F);
        this.body2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.4363F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 6, 7, -0.5F, -0.025F, 0.0F, 1, 0, 3, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 22, 3, 0.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.bookgill1 = new AdvancedModelRenderer(this);
        this.bookgill1.setRotationPoint(0.0F, 1.1F, 0.3F);
        this.body2.addChild(bookgill1);
        this.setRotateAngle(bookgill1, 1.309F, 0.0F, 0.0F);
        this.bookgill1.cubeList.add(new ModelBox(bookgill1, 12, 0, -2.0F, -0.5F, 0.0F, 4, 2, 0, 0.0F, false));

        this.bookgill2 = new AdvancedModelRenderer(this);
        this.bookgill2.setRotationPoint(0.0F, 1.1F, 0.8F);
        this.body2.addChild(bookgill2);
        this.setRotateAngle(bookgill2, 1.309F, 0.0F, 0.0F);
        this.bookgill2.cubeList.add(new ModelBox(bookgill2, 12, 12, -2.0F, -0.5F, 0.0F, 4, 2, 0, 0.0F, false));

        this.bookgill3 = new AdvancedModelRenderer(this);
        this.bookgill3.setRotationPoint(0.0F, 1.1F, 1.3F);
        this.body2.addChild(bookgill3);
        this.setRotateAngle(bookgill3, 1.309F, 0.0F, 0.0F);
        this.bookgill3.cubeList.add(new ModelBox(bookgill3, 12, 0, -2.0F, -0.5F, 0.0F, 4, 2, 0, 0.0F, false));

        this.bookgill4 = new AdvancedModelRenderer(this);
        this.bookgill4.setRotationPoint(0.0F, 1.1F, 1.8F);
        this.body2.addChild(bookgill4);
        this.setRotateAngle(bookgill4, 1.309F, 0.0F, 0.0F);
        this.bookgill4.cubeList.add(new ModelBox(bookgill4, 12, 12, -2.0F, -0.5F, 0.0F, 4, 2, 0, 0.0F, false));

        this.bookgill5 = new AdvancedModelRenderer(this);
        this.bookgill5.setRotationPoint(0.0F, 1.1F, 2.3F);
        this.body2.addChild(bookgill5);
        this.setRotateAngle(bookgill5, 1.309F, 0.0F, 0.0F);
        this.bookgill5.cubeList.add(new ModelBox(bookgill5, 12, 0, -2.0F, -0.5F, 0.0F, 4, 2, 0, 0.0F, false));

        this.bookgill6 = new AdvancedModelRenderer(this);
        this.bookgill6.setRotationPoint(0.0F, 1.1F, 2.8F);
        this.body2.addChild(bookgill6);
        this.setRotateAngle(bookgill6, 1.309F, 0.0F, 0.0F);
        this.bookgill6.cubeList.add(new ModelBox(bookgill6, 12, 12, -2.0F, -0.5F, 0.0F, 4, 2, 0, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.4257F, 4.9424F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.0873F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 23, 0, -1.0F, -0.425F, -0.75F, 2, 1, 2, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.0274F, 1.1692F);
        this.body3.addChild(tail);
        this.setRotateAngle(tail, 0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 14, 6, -0.5F, -0.3719F, 0.0039F, 1, 1, 4, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body2, -0.1F, 0.2F, 0.0F);
        this.setRotateAngle(body3, -0.05F, 0.2F, 0.0F);
        this.setRotateAngle(tail, 0.1F, 0.2F, 0.0F);
        this.body.offsetY = 0.06F;
        this.body.offsetZ = 0.016F;
        this.body.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -1.60F;
        this.body.offsetX = 0.0F;
        this.body.rotateAngleY = (float)Math.toRadians(202);
        this.body.rotateAngleX = (float)Math.toRadians(32);
        this.body.rotateAngleZ = (float)Math.toRadians(-12);
        this.body.scaleChildren = true;
        float scaler = 4.80F;
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
