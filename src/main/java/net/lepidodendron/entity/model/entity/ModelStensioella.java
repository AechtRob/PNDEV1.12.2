package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelStensioella extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;

    public ModelStensioella() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(2.0F, -2.6256F, -4.2656F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 24, 34, -2.0F, -0.25F, 2.5F, 0, 1, 1, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 17, 5, -4.0F, 0.0F, 0.0F, 4, 1, 4, 0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, -0.7836F, -7.9544F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1767F, -0.734F, 0.119F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 11, 39, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, -1.75F, -7.8238F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2239F, -0.6846F, -0.1039F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 39, 0.0F, 0.0F, 0.0F, 2, 1, 2, 0.003F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.3512F, -0.5911F, -6.4924F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.132F, -0.1298F, 0.0172F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 34, 7, 0.0F, -1.0F, 0.0F, 2, 1, 3, -0.006F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.3051F, -2.1023F, -6.3441F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0436F, -0.1525F, -0.0574F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 34, 12, 0.0F, 0.0F, 0.0F, 2, 1, 3, 0.003F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.7428F, -0.2029F, -3.5435F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0901F, 0.1286F, -0.0303F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 34, 0, 0.0F, -2.0F, 0.0F, 1, 2, 4, 0.003F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.7836F, -7.9544F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2182F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 30, 17, -1.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(2.7428F, -0.2029F, -3.5435F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0901F, -0.1286F, 0.0303F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 34, 0, -1.0F, -2.0F, 0.0F, 1, 2, 4, 0.003F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(2.3512F, -0.5911F, -6.4924F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.132F, 0.1298F, -0.0172F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 34, 7, -2.0F, -1.0F, 0.0F, 2, 1, 3, -0.006F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(2.3051F, -2.1023F, -6.3441F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0436F, 0.1525F, 0.0574F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 34, 12, -2.0F, 0.0F, 0.0F, 2, 1, 3, 0.003F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.9137F, -1.9798F, -6.475F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1356F, -0.7524F, -0.0518F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 41, 33, -1.125F, -0.075F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.9137F, -1.9798F, -6.475F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1356F, 0.7524F, 0.0518F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 41, 33, 0.125F, -0.075F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.0F, -1.75F, -7.8238F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2239F, 0.6846F, 0.1039F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 20, 39, -2.0F, 0.0F, 0.0F, 2, 1, 2, 0.003F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, -0.7836F, -7.9544F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1767F, 0.734F, -0.119F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 11, 39, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.2606F, -0.0228F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0436F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 17, 11, -2.0F, -1.05F, -3.975F, 4, 1, 4, -0.003F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.2615F, -3.9886F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1309F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 28, 27, -1.0F, -1.0F, -4.0F, 2, 1, 4, 0.003F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.9615F, -3.9886F);
        this.main.addChild(jaw);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, 1.2221F, 3.9658F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0436F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 13, 34, -1.0F, -2.05F, -5.95F, 3, 2, 2, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 29, 39, -0.5F, -1.05F, -7.75F, 2, 1, 2, -0.003F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(2.0475F, -0.4018F, -1.6571F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.026F, -0.8722F, 0.0602F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 2, 0, 0.5F, 0.0F, 0.0F, 8, 0, 5, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-2.0475F, -0.4018F, -1.6571F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.026F, 0.8722F, -0.0602F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 2, 0, -8.5F, 0.0F, 0.0F, 8, 0, 5, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.4834F, -0.7063F);
        this.main.addChild(tail);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 1.0497F, 3.7733F);
        this.tail.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0524F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 12, -2.0F, -1.65F, -4.0F, 4, 2, 4, -0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(2.0F, -1.2166F, -0.0437F);
        this.tail.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0873F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 41, 23, -2.0F, -0.325F, 0.5F, 0, 1, 3, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 5, -4.0F, -0.075F, 0.0F, 4, 2, 4, -0.006F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.2789F, 3.5168F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 26, -1.5F, 0.1206F, -0.2478F, 3, 1, 4, -0.003F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.5F, -1.1955F, -0.0605F);
        this.tail2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0873F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 41, 28, -1.5F, -0.275F, 0.75F, 0, 1, 3, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 19, -3.0F, -0.025F, 0.0F, 3, 2, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.2045F, 3.4395F);
        this.tail2.addChild(tail3);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.2701F, 3.9042F);
        this.tail3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0873F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 28, 33, -1.0F, -0.725F, -4.0F, 2, 1, 4, -0.003F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -0.586F, 2.2243F);
        this.tail3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.9948F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 29, 0, 0.0F, -1.2F, -0.425F, 0, 2, 2, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-2.0F, -1.0F, 0.0F);
        this.tail3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0873F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 32, 1.0F, -0.075F, 0.0F, 2, 1, 4, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(0.3012F, 0.5734F, 1.5436F);
        this.tail3.addChild(backLeftFin);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.1012F, -0.0984F, -0.0436F);
        this.backLeftFin.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0843F, -0.0226F, 0.2608F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 38, 0.0F, 0.25F, -1.5F, 2, 0, 3, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-0.3012F, 0.5734F, 1.5436F);
        this.tail3.addChild(backRightFin);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.1012F, -0.0984F, -0.0436F);
        this.backRightFin.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0843F, 0.0226F, -0.2608F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 38, -2.0F, 0.25F, -1.5F, 2, 0, 3, 0.0F, true));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.15F, 3.5F);
        this.tail3.addChild(tail4);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -0.1946F, 3.9392F);
        this.tail4.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.2618F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 17, 17, 0.0F, -1.35F, -3.325F, 0, 3, 6, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.tail4.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1745F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 15, 27, -0.5F, -1.0F, 0.0F, 1, 1, 5, 0.0F, false));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5 * 0.2F);
    }
    public void renderStaticWall(float f) {
        this.setRotateAngle(main, 1.5F, 0.0F, 1.55F);
        this.main.offsetY = -0.0F;
        this.main.offsetX = -0.07F;
        this.main.offsetZ = -0.4F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {

        this.main.offsetY = -0.1F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {

        this.main.offsetY = 0.1F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = 1.2F;
        this.main.offsetX = 0.1F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(0);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 0.6F;
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
        this.main.offsetY = 1.15F;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};
        float speed = 0.3F;
        if (!e.isInWater()) { // if not in water
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {



            this.walk(backLeftFin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(backLeftFin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            if(f3>0 || !e.isInWater()) { //if moving, slap fins
                this.flap(frontLeftFin, speed, 0.3F, true, -3, 0, f2, 1);
                this.flap(frontRightFin, speed, -0.3F, true, -3, 0, f2, 1);
                this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed, 0.25F, -3, f2, 1);
            } else { //if not accelerating swing fins instead
                this.swing(frontLeftFin, (float)(speed*0.15), (float)Math.toRadians(5), false, 0, -0.3F, f2, 1);
                this.swing(frontRightFin, (float)(speed*0.15), (float)Math.toRadians(5), false, 0, 0.3F, f2, 1);
                this.flap(frontLeftFin, (float)(speed*0.15), 0.25F, true, -3, 0, f2, 1);
                this.flap(frontRightFin, (float)(speed*0.15), -0.25F, true, -3, 0, f2, 1);
                this.chainWave(fishTail, speed*0.15F, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed*0.15F, 0.3F, -3, f2, 1);
            }


            this.walk(backRightFin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(backRightFin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);


            if (!e.isInWater()) {
                this.main.offsetY = 1.15F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
