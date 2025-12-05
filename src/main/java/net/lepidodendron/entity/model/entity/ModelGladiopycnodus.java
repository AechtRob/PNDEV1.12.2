package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelGladiopycnodus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer rightSpine;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer leftSpine;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer backSpine;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer backSpine2;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;

    public ModelGladiopycnodus() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.0F, -5.25F, -2.6F, 4, 4, 3, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 22, 19, -1.5F, -4.75F, -4.55F, 3, 3, 2, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 32, -1.0F, -3.85F, -6.35F, 2, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -3.7755F, -6.3573F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3752F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 23, -0.5F, 0.0F, 0.0F, 2, 1, 3, 0.006F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -3.7899F, -6.2583F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.144F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 29, 30, -0.5F, 0.0F, -3.1F, 1, 1, 3, -0.003F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -3.2941F, -6.1931F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3054F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 8, -0.5F, -1.0F, -6.0F, 1, 1, 6, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -5.4507F, -2.6789F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3054F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 33, 22, -0.5F, 0.0F, -4.0F, 2, 1, 2, 0.003F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 28, -1.0F, 0.0F, -2.0F, 3, 1, 2, 0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, -6.1F, 0.25F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2182F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 15, 14, -0.5F, 0.0F, -3.0F, 3, 1, 3, 0.006F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -4.25F, -3.35F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2618F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 37, 0.625F, -0.625F, -0.3F, 1, 1, 1, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 37, -1.625F, -0.625F, -0.3F, 1, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -0.6105F, -1.5951F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1484F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 22, 25, -0.5F, -1.0F, -3.0F, 2, 1, 3, -0.003F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, -0.75F, 0.4F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0698F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 28, 0, -0.5F, -1.0F, -2.0F, 3, 1, 2, 0.006F, false));

        this.rightSpine = new AdvancedModelRenderer(this);
        this.rightSpine.setRotationPoint(-2.1311F, -4.2465F, -0.3092F);
        this.main.addChild(rightSpine);
        this.setRotateAngle(rightSpine, 0.0F, 0.0F, 0.1309F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 3.0F, 1.25F);
        this.rightSpine.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0074F, -0.0681F, 0.1655F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 29, 35, 0.0F, -0.5F, -0.2F, 0, 1, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.4019F, 3.7315F, 1.0189F);
        this.rightSpine.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.8018F, -0.1385F, 0.3463F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 19, 37, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.1311F, -0.3154F, 0.0165F);
        this.rightSpine.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.4001F, -0.0681F, 0.1655F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 7, 37, 0.0F, 0.0F, -0.675F, 1, 4, 1, 0.0F, false));

        this.leftSpine = new AdvancedModelRenderer(this);
        this.leftSpine.setRotationPoint(2.1311F, -4.2465F, -0.3092F);
        this.main.addChild(leftSpine);
        this.setRotateAngle(leftSpine, 0.0F, 0.0F, -0.1309F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 3.0F, 1.25F);
        this.leftSpine.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0074F, 0.0681F, -0.1655F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 29, 35, 0.0F, -0.5F, -0.2F, 0, 1, 3, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.4019F, 3.7315F, 1.0189F);
        this.leftSpine.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.8018F, 0.1385F, -0.3463F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 19, 37, 0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.1311F, -0.3154F, 0.0165F);
        this.leftSpine.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.4001F, 0.0681F, -0.1655F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 7, 37, -1.0F, 0.0F, -0.675F, 1, 4, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -2.0351F, -4.4542F);
        this.main.addChild(jaw);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 0.9811F, -0.108F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.5411F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 38, 14, 0.0F, -1.25F, -2.525F, 1, 1, 0, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 12, 37, -0.5F, -1.0F, -2.775F, 2, 1, 1, -0.006F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 33, 18, -0.5F, -1.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.main.addChild(tail);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, 2.25F, 0.4F);
        this.tail.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1353F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 28, 8, -0.5F, -1.0F, 0.0F, 3, 1, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -3.1F, 0.25F);
        this.tail.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.3054F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 28, 4, -1.5F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -0.15F, 1.25F);
        this.tail.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0698F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 16, -1.5F, -2.0F, -1.075F, 3, 4, 2, 0.003F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.5F, 1.35F, 1.0F);
        this.tail.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.4326F, -0.2149F, 0.4326F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 11, 16, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.5F, 1.35F, 1.0F);
        this.tail.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.4326F, 0.2149F, -0.4326F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 11, 16, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 15, 0, -1.0F, -0.875F, -0.8F, 2, 2, 4, 0.003F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 1.9803F, 0.3817F);
        this.tail2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2662F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 11, 26, -0.5F, -1.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.5F, -2.4986F, 0.1574F);
        this.tail2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.48F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 11, 31, 1.5F, -0.8F, 0.55F, 0, 2, 3, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 15, 7, 0.5F, 0.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.2054F, 3.1613F);
        this.tail2.addChild(tail3);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -0.6054F, -0.2113F);
        this.tail3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.3054F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 33, 26, -0.5F, -0.475F, -0.175F, 1, 1, 2, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, 0.9858F, 0.1148F);
        this.tail3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.2662F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 37, 12, 0.5F, -0.55F, -0.875F, 0, 1, 2, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.9858F, 0.1148F);
        this.tail3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1789F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 36, 35, -0.5F, -1.05F, -0.375F, 1, 1, 2, -0.003F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.25F, 1.5F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 22, 30, 0.0F, -1.25F, 0.0F, 0, 3, 3, 0.0F, false));

        this.backSpine = new AdvancedModelRenderer(this);
        this.backSpine.setRotationPoint(-1.2349F, 1.0F, 0.9145F);
        this.tail2.addChild(backSpine);
        this.setRotateAngle(backSpine, 0.0F, -0.3491F, 0.0F);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 1.187F, 3.8524F);
        this.backSpine.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0438F, 0.0872F, -0.0038F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 11, 19, 0.025F, -1.0F, 0.0F, 0, 1, 5, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.backSpine.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1772F, 0.1719F, -0.0306F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 36, -0.725F, -1.45F, -1.2F, 1, 2, 2, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.backSpine.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.1745F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 28, 12, -0.5F, -0.5F, 0.0F, 0, 1, 4, 0.0F, false));

        this.backSpine2 = new AdvancedModelRenderer(this);
        this.backSpine2.setRotationPoint(1.2349F, 1.0F, 0.9145F);
        this.tail2.addChild(backSpine2);
        this.setRotateAngle(backSpine2, 0.0F, 0.3491F, 0.0F);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 1.187F, 3.8524F);
        this.backSpine2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0438F, -0.0872F, 0.0038F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 11, 19, -0.025F, -1.0F, 0.0F, 0, 1, 5, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.backSpine2.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.1772F, -0.1719F, 0.0306F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 36, -0.275F, -1.45F, -1.2F, 1, 2, 2, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.backSpine2.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.1745F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 28, 12, 0.5F, -0.5F, 0.0F, 0, 1, 4, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.8F;
        this.main.offsetX = 0.2F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 5.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetY = -0.125F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.body.offsetY = 1.35F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }
        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};
        float speed = 0.5F;
        float degree = 1F;
        if (!e.isInWater()) {
            speed = 0.8F;
        } else if(isAtBottom) {
            degree = 0.5f;
            speed = 0.25f;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.35F*degree, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);

            this.walk(frontLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(frontRightFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontRightFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);



            this.swing(main, speed, 0.3F*degree, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(270);
//                this.main.offsetX = 0.40F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
