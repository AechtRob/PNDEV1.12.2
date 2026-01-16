package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelHanduichthys extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer jaw;


    public ModelHanduichthys() {
        this.textureWidth = 38;
        this.textureHeight = 38;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, -3.25F);
        this.main.cubeList.add(new ModelBox(main, 0, 14, 0.15F, -4.0F, -1.3F, 1, 3, 2, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 14, -1.15F, -4.0F, -1.3F, 1, 3, 2, 0.0F, true));
        this.main.cubeList.add(new ModelBox(main, 11, 0, -1.0F, -4.95F, 0.1F, 2, 1, 3, -0.01F, false));
        this.main.cubeList.add(new ModelBox(main, 29, 0, 0.075F, -3.6527F, -2.5279F, 1, 1, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 29, 0, -1.075F, -3.6527F, -2.5279F, 1, 1, 1, 0.0F, true));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -1.0F, -4.2F, 0.05F, 2, 4, 3, 0.005F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.4F, -0.25F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3752F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 8, -1.0F, -1.925F, -2.6F, 2, 2, 3, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -3.95F, 2.275F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3054F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 24, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.003F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -4.05F, 0.6F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.5236F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 29, 3, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -4.075F, 1.25F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2182F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 23, 13, 0.0F, -1.0F, -1.0F, 1, 1, 2, 0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.025F, 1.05F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2182F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 9, -1.0F, -1.0F, -1.0F, 2, 1, 2, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.25F, -0.95F, 1.05F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2182F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 5, 0.0F, 0.2F, -1.0F, 1, 0, 3, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 5, 1.5F, 0.2F, -1.0F, 1, 0, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.25F, -1.6F, 1.05F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1309F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 14, 19, 0.0F, 0.0F, -1.0F, 1, 0, 3, 0.0F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 14, 19, 1.5F, 0.0F, -1.0F, 1, 0, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.25F, -3.45F, 1.05F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1309F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 14, 15, 0.0F, -0.2F, -1.5F, 1, 0, 3, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 14, 15, 1.5F, -0.2F, -1.5F, 1, 0, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, -0.7F, 3.3F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0436F, -0.0873F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 17, 27, 0.0F, -0.5F, -0.5F, 0, 1, 2, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.0F, -0.7F, 3.3F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0436F, 0.0873F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 17, 27, 0.0F, -0.5F, -0.5F, 0, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -4.5171F, -1.8526F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.6981F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 11, 10, -1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -4.95F, 0.1F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2182F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 11, 5, -1.0F, 0.0F, -2.0F, 2, 2, 2, 0.003F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.1F, -2.2F, 0.7F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.1745F, 0.2618F, 0.0F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 29, 9, 0.0F, -0.5F, -0.1F, 0, 1, 1, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.1F, -2.2F, 0.7F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.1745F, -0.2618F, 0.0F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 29, 9, 0.0F, -0.5F, -0.1F, 0, 1, 1, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.75F, 3.05F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 7, 15, -0.25F, -1.25F, -0.8F, 1, 3, 2, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 7, 15, -0.75F, -1.25F, -0.8F, 1, 3, 2, 0.003F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.35F, -1.025F, 0.2F);
        this.tail.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1745F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 20, -0.85F, -1.0F, -1.0F, 1, 1, 2, 0.006F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.35F, 2.25F, 0.2F);
        this.tail.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 21, 23, -0.85F, -1.0F, -1.0F, 1, 1, 2, 0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, -1.075F, -0.05F);
        this.tail.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2182F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 27, 27, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, -0.975F, 0.725F);
        this.tail.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1745F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 22, 27, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.003F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 1.2F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 7, 21, -0.5F, -1.1F, -0.7F, 1, 1, 2, 0.003F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 24, -0.5F, -0.5F, -0.7F, 1, 1, 2, -0.003F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.35F, 2.0472F, -0.3383F);
        this.tail2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.9032F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 22, 0, -0.85F, -1.0F, 0.0F, 1, 1, 2, -0.009F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.8F, 1.4F);
        this.tail2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 1.0341F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 12, 27, 0.0F, -1.075F, -1.9F, 0, 1, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -1.1F, 1.3F);
        this.tail2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.6545F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 5, 30, 0.0F, -0.5F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.35F, -1.1F, 1.3F);
        this.tail2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.5236F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 29, 6, -0.85F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.6F, 1.2821F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 28, -0.5F, -0.5F, 0.0179F, 1, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.15F, 0.0F, 0.2679F);
        this.tail3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.7854F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 7, 25, 0.15F, 0.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -1.4049F, -2.2736F);
        this.main.addChild(jaw);
        this.setRotateAngle(jaw, -0.7418F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 14, 23, -0.75F, -0.75F, -1.95F, 1, 1, 2, -0.006F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 23, 17, -0.25F, -0.75F, -1.95F, 1, 1, 2, -0.003F, false));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.2F;
        this.main.offsetX = 0.238F;
        this.main.rotateAngleY = (float)Math.toRadians(242);
        this.main.rotateAngleX = (float)Math.toRadians(8);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 3.63F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        resetToDefaultPose();
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
        //this.main.offsetY = 0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.27F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.3F, true, 0, -0.3F, f2, 1);

            this.flap(frontLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontLeftFin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(frontRightFin, (float) (speed * 0.75), 0.15F, true, -3, 0, f2, 1);
            this.swing(frontRightFin, (float) (speed * 0.75), 0.2F, true, -3, 0, f2, 1);


            this.swing(main, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = -0.1F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
