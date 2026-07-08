package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraRetodus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelRetodus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;

    public ModelRetodus() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 18.0F, -19.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 4.6706F, -3.3595F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 32, -3.0F, -2.0F, 0.0F, 6, 2, 7, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -3.125F, 4.0F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1004F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -3.5F, 0.0F, -8.0F, 7, 7, 8, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.2652F, -8.9895F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3054F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 52, 23, -3.5F, -1.0F, -0.05F, 7, 2, 4, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 1.0871F, -11.0691F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 74, 41, -2.5F, -1.0F, 0.0F, 5, 1, 2, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.779F, -9.837F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.5236F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 64, 58, -2.5F, 0.0F, -2.0F, 5, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.25F, -1.5554F, -6.9392F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2618F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 22, 50, -3.5F, 1.0F, -2.0F, 1, 1, 1, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 22, 50, 3.0F, 1.0F, -2.0F, 1, 1, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 54, 68, -3.25F, 0.0F, -3.0F, 7, 2, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 4.3947F, -3.2519F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2618F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 26, 48, -4.5F, -4.7F, -3.0F, 9, 5, 4, 0.02F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -2.25F, -3.0F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1745F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 41, -4.5F, 0.0F, -4.0F, 9, 5, 4, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(3.5F, 3.25F, -0.75F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.5236F, 0.2618F, -0.1745F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 30, 0, 0.0F, -3.0F, 0.0F, 0, 4, 11, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-3.5F, 3.25F, -0.75F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.5236F, -0.2618F, 0.1745F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 30, 0, 0.0F, -3.0F, 0.0F, 0, 4, 11, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.0F, -6.0F);
        this.main.addChild(jaw);
        this.setRotateAngle(jaw, -0.2618F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 54, 61, -3.0F, -1.75F, -3.0F, 6, 3, 4, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 74, 54, -2.0F, 0.25F, -5.0F, 4, 1, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 1.25F, -3.0F);
        this.jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1309F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 32, 70, -3.0F, -1.0F, 0.0F, 6, 1, 4, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.25F, -5.0F);
        this.jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2182F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 74, 32, -2.0F, 0.0F, 0.0F, 4, 1, 3, -0.01F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.main.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 26, 15, -3.0F, -3.0F, -0.5F, 6, 9, 7, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, -3.0F, 3.5F);
        this.body1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1309F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 36, 57, -3.0F, 0.0F, 0.0F, 5, 1, 3, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 15, -2.5F, -3.0F, -0.5F, 5, 9, 8, 0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -2.0F, 0.5F);
        this.body2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 50, 31, -1.5F, -1.5F, -1.0F, 4, 2, 8, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.5F, 7.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 26, 31, -2.0F, -3.5F, -0.5F, 4, 9, 8, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 52, 73, 0.0F, -6.0F, 0.0F, 0, 3, 7, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0F, -3.5F, -0.5F);
        this.body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1047F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 52, 14, -0.5F, -1.0F, 0.0F, 3, 1, 8, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(2.0F, 4.75F, 3.75F);
        this.body3.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.6109F, 0.2618F, -0.1745F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 0, 67, 0.0F, -2.5F, 0.0F, 0, 3, 8, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-2.0F, 4.75F, 3.75F);
        this.body3.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.6109F, -0.2618F, 0.1745F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 0, 67, 0.0F, -2.5F, 0.0F, 0, 3, 8, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 1.5F, 7.0F);
        this.body3.addChild(tail1);
        this.tail1.cubeList.add(new ModelBox(tail1, 52, 0, -1.5F, -3.0F, -0.5F, 3, 7, 7, -0.01F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 66, 73, 0.0F, -8.5F, 0.0F, 0, 5, 6, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 18, 50, 0.0F, 4.5F, 4.0F, 0, 1, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.0F, 5.0261F, 3.6691F);
        this.tail1.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2269F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 74, 66, 0.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.0F, 4.0F, 0.85F);
        this.tail1.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.3491F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 74, 36, 0.0F, -1.0F, -1.0F, 2, 1, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, -5.0F, 0.5F);
        this.tail1.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.2356F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 36, 61, 0.0F, 0.0F, -0.75F, 2, 2, 7, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.5F, 6.0F);
        this.tail1.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 18, 57, -1.0F, -1.5F, -0.5F, 2, 4, 7, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 52, 41, 0.0F, -8.0F, 0.0F, 0, 14, 6, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0F, 3.75F, 0.5F);
        this.tail2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1309F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 72, 0, 0.5F, -2.0F, -0.85F, 1, 2, 7, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.5F, -4.05F, 0.25F);
        this.tail2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.3229F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 16, 68, 1.0F, 0.0F, -0.25F, 1, 3, 7, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.5F, 6.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 74, 9, -0.5F, -1.0F, -0.5F, 1, 2, 6, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 64, 41, 0.0F, -6.5F, 0.0F, 0, 12, 5, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.5F, 2.0F, 0.5F);
        this.tail3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2531F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 74, 17, 1.0F, -1.75F, -1.0F, 1, 2, 6, -0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.5F, -2.45F, 0.25F);
        this.tail3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.2967F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 74, 25, 1.0F, 0.0F, 0.0F, 1, 2, 5, -0.01F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 74, 44, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 50, 0.0F, -4.5F, -0.5F, 0, 8, 9, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.5F, 1.0F, 0.0F);
        this.tail4.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1309F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 74, 61, 1.0F, -1.0F, 0.0F, 1, 1, 4, -0.01F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.5F, -1.0F, 0.0F);
        this.tail4.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1222F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 74, 49, 1.0F, 0.0F, 0.0F, 1, 1, 4, -0.01F, false));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.75F;
        this.main.offsetX = 0.19F;
        this.main.rotateAngleY = (float)Math.toRadians(240);
        this.main.rotateAngleX = (float)Math.toRadians(8);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 0.89F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
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
        //this.main.offsetY = 1F;
        this.main.offsetZ = 0.5F;

        
        AdvancedModelRenderer[] finPelvicLeft = {this.frontLeftFin};
        AdvancedModelRenderer[] finPelvicRight = {this.frontRightFin};
        AdvancedModelRenderer[] fishTail = {this.body1, this.body2, this.body3, this.tail1, this.tail2, this.tail3, this.tail4};

        float speed = 0.15F;
        float outOfWater = 1;
        if (!e.isInWater()) {
            speed = 0.5F;
        }
        if (!((EntityPrehistoricFloraRetodus) e).isReallyInWater()) {
            outOfWater = 1.45f;
            this.main.bob(speed, 0.35F, false, f2, 1F);
            //this.main.offsetY = 1.1F;
        }

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }
        if (isAtBottom) {
            //System.err.println("Animation at bottom");
            speed = speed * 0.55F;
        }
        //if (!e.isInWater()) {
        //    outOfWater = 0.05f;
        //}

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed * outOfWater, 0.05F * outOfWater, -3, f2, 1);
            this.chainSwing(fishTail, speed * outOfWater, 0.3F * outOfWater, -2.5, f2, 1);
            this.swing(main, speed * outOfWater, 0.21F * outOfWater, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75) * outOfWater, (float)Math.toRadians(17.5), false, 0, 0.3F, f2, 1);

            this.chainWave(finPelvicLeft, speed * outOfWater, 0.25F * outOfWater, 0.5F, f2, 1);
            this.chainSwing(finPelvicLeft, speed * outOfWater, 0.25F * outOfWater, 0.5F, f2, 1);
            this.chainFlap(finPelvicLeft, speed * outOfWater, 0.15F * outOfWater, -0.8, f2, 1);

            this.chainWave(finPelvicRight, speed * outOfWater, 0.25F * outOfWater, 0.5F, f2, 1);
            this.chainSwing(finPelvicRight, speed * outOfWater, -0.25F * outOfWater, 0.5F, f2, 1);
            this.chainFlap(finPelvicRight, speed * outOfWater, -0.15F * outOfWater, 0.8, f2, 1);


            //if (!e.isInWater()) {
            //    this.Bodymiddlefront.rotateAngleZ = (float)Math.toRadians(90);
            //    this.Bodymiddlefront.offsetY = 1.35F;
            //}
        }
    }
}
