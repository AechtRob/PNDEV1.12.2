package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelYiminaspis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer spine;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer spine2;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;

    public ModelYiminaspis() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 23.8F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 24, 32, -1.0F, -1.0F, -8.0F, 2, 1, 2, 0.006F, false));
        this.main.cubeList.add(new ModelBox(main, 17, 0, -2.0F, -2.0F, -3.2F, 4, 2, 4, 0.009F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.4821F, 0.0F, -5.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 1.8326F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 35, -1.9F, -2.0F, -0.2F, 2, 2, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.7321F, 0.0F, -7.0F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 1.5708F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 36, -2.0F, -1.0F, 0.0F, 2, 1, 1, -0.003F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, -1.0F, -8.0F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.5236F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 33, -2.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.6787F, -1.3651F, -5.4765F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.401F, -0.3063F, -0.1843F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 37, 25, -0.325F, -0.525F, -0.475F, 1, 1, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.4821F, 0.0F, -5.0F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -1.8326F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 35, -0.1F, -2.0F, -0.2F, 2, 2, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(2.7321F, 0.0F, -7.0F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -1.5708F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 30, 36, 0.0F, -1.0F, 0.0F, 2, 1, 1, -0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, -1.0F, -8.0F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.5236F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 33, 0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0436F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 21, -2.0F, -1.0F, -3.0F, 4, 1, 3, 0.003F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, -2.5395F, -3.2617F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 17, 7, -0.5F, 0.0F, 0.0F, 3, 2, 4, -0.003F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -2.1067F, -5.2143F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2182F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 28, 21, -1.5F, 0.0F, 0.0F, 4, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.6787F, -1.3651F, -5.4765F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.401F, 0.3063F, 0.1843F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 37, 25, -0.675F, -0.525F, -0.475F, 1, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.4226F, -7.0937F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.3491F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 24, 28, -1.5F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, -1.0F, -8.0F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.4363F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 23, 36, -0.5F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.4F, -5.9F);
        this.main.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 33, 32, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.0F, 0.4F, -1.85F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0173F, -0.5103F, -0.0199F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 34, 0, 0.0F, -0.9F, 0.0F, 2, 1, 2, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.0F, 0.4F, -1.85F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0173F, 0.5103F, 0.0199F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 34, 0, -2.0F, -0.9F, 0.0F, 2, 1, 2, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(2.2736F, -0.4F, -1.5338F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.1309F, 0.3491F, 0.0F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 32, 7, -1.0F, 0.0F, 0.0F, 2, 0, 3, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-2.2736F, -0.4F, -1.5338F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.1309F, -0.3491F, 0.0F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 32, 7, -1.0F, 0.0F, 0.0F, 2, 0, 3, 0.0F, true));

        this.spine = new AdvancedModelRenderer(this);
        this.spine.setRotationPoint(1.8933F, -0.55F, -3.3221F);
        this.main.addChild(spine);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.5502F, -0.5F, 2.5297F);
        this.spine.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 1.4094F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 35, 28, 0.0F, 0.0F, -2.0F, 1, 1, 2, -0.003F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.0306F, -0.5F, 0.3548F);
        this.spine.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.6981F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 32, 11, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.003F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.0594F, -0.5525F, 1.0797F);
        this.spine.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -1.1645F, 1.4532F, -0.0294F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 37, -1.075F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.1067F, -0.5F, -0.0279F);
        this.spine.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 1.1781F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 28, 25, -3.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

        this.spine2 = new AdvancedModelRenderer(this);
        this.spine2.setRotationPoint(-1.8933F, -0.55F, -3.3221F);
        this.main.addChild(spine2);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.5502F, -0.5F, 2.5297F);
        this.spine2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -1.4094F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 35, 28, -1.0F, 0.0F, -2.0F, 1, 1, 2, -0.003F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.0306F, -0.5F, 0.3548F);
        this.spine2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.6981F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 32, 11, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.003F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0594F, -0.5525F, 1.0797F);
        this.spine2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -1.1645F, -1.4532F, 0.0294F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 37, -0.925F, -0.5F, -0.5F, 2, 1, 1, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.1067F, -0.5F, -0.0279F);
        this.spine2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -1.1781F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 28, 25, 0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.1842F, -1.4364F, 0.0149F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 17, 14, -1.6842F, -0.5636F, -0.0149F, 3, 2, 4, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.8158F, -1.3965F, 0.6152F);
        this.tail.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.1265F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 9, 35, -1.0F, -0.75F, 0.0F, 0, 1, 3, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.1842F, -0.5636F, 3.9851F);
        this.tail.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.0393F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 15, 21, 0.0F, -0.65F, -4.0F, 2, 2, 4, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(0.4367F, 1.3606F, 2.9297F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.0266F, -0.329F, 0.2673F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 34, 4, 0.0F, 0.0F, -1.0F, 2, 0, 2, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-0.8051F, 1.3606F, 2.9297F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.0266F, 0.329F, -0.2673F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 34, 4, -2.0F, 0.0F, -1.0F, 2, 0, 2, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(-0.1842F, 0.1449F, 3.5308F);
        this.tail.addChild(tail2);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.5F, -0.7085F, -0.0457F);
        this.tail2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0916F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 13, 28, 1.0F, -0.65F, 0.0F, 1, 2, 4, 0.003F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.0F, 1.2915F, -0.0457F);
        this.tail2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0611F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 26, 0.0F, -2.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.2485F, 3.7182F);
        this.tail2.addChild(tail3);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-2.0F, -0.0193F, 2.925F);
        this.tail3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.1004F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 0, 2.0F, -0.95F, -3.0F, 0, 3, 8, 0.0F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 12, 1.5F, -1.0F, -3.0F, 1, 1, 7, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-1.5F, 1.2958F, 0.2286F);
        this.tail3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.4538F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 32, 16, 1.0F, -1.0F, 0.0F, 1, 1, 3, -0.003F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }
    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(180);
        this.setRotateAngle(main, 1.5F, 0.0F, 1.5F);
        this.main.offsetY = -0.3F;
        this.main.offsetX = -0.0F;
        this.main.offsetZ = -0.4F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {

        this.main.offsetY = -0.2F;
        this.main.offsetX = -0.005F;
        this.main.render(0.01F);
        resetToDefaultPose();


    }
    public void renderStaticSuspended(float f) {

        this.main.offsetY = 0.2F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.3F;
        this.main.offsetX = 0.2F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 2.2F;
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
        this.main.offsetY = 0.0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};

        float speed = 0.4F;
        float taildegree = 0.35F;

        if (!e.isInWater()) {
            speed = 0.7F;
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
            speed = 0.15F;
            taildegree = 0.15F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, taildegree, -3, f2, 1);
            this.swing(main, speed, 0.3F, true, 0, 0, f2, 1);
            this.walk(frontLeftFin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.swing(frontLeftFin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.walk(frontRightFin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.swing(frontRightFin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.walk(backLeftFin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.swing(backLeftFin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.walk(backRightFin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.swing(backRightFin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);


            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = 0.05F;
                this.bob(main, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }


}
