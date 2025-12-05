package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelEusebichthys extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;

    public ModelEusebichthys() {
        this.textureWidth = 50;
        this.textureHeight = 44;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0165F, 18.9344F, -1.6147F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.0165F, -2.1844F, -2.3853F, 4, 6, 5, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 29, -1.5165F, -1.8844F, -4.3853F, 3, 4, 2, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 28, 20, -1.5165F, -1.1844F, 2.6147F, 3, 4, 2, 0.006F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0165F, -2.3373F, 3.5011F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.6196F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 33, 34, -0.5F, 0.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0165F, -3.2992F, 1.7477F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.5018F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 22, 34, -0.5F, 0.0F, 0.0F, 3, 2, 2, 0.003F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0165F, 1.6201F, -6.3313F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.0242F, -0.0796F, 0.1045F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 39, 28, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.9835F, 1.6201F, -6.3313F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.0242F, 0.0796F, -0.1045F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 39, 28, -1.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5165F, 0.612F, -6.227F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.2872F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 22, 39, -0.5F, 0.0F, -1.0F, 2, 3, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.1665F, 1.0297F, -4.702F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3709F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 39, 25, -1.0F, -0.625F, -0.75F, 2, 1, 1, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 39, 25, -0.7F, -0.625F, -0.75F, 2, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5165F, -1.8824F, -4.5603F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.9817F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 11, 30, -0.5F, 0.0F, -3.0F, 2, 2, 3, 0.003F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5165F, -3.7601F, -2.2206F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.6763F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 30, 9, -0.5F, 0.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.5165F, -6.121F, 2.4591F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.5323F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 19, 11, 1.475F, 0.0F, 0.0F, 0, 3, 5, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.5165F, -6.121F, 2.4591F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2269F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 30, 0, 1.5F, 0.0F, -4.0F, 0, 4, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0165F, -3.6293F, -0.2249F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0654F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 36, -0.5F, 0.0F, -2.0F, 3, 2, 2, 0.003F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0165F, -3.2992F, 1.7477F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1658F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 30, 15, -0.5F, 0.0F, -2.0F, 3, 2, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0165F, 4.2085F, 3.7966F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.8945F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 39, 0, -0.5F, -2.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-2.5165F, 4.9334F, 1.9325F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 1.1126F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 19, 20, 2.525F, 0.0F, 0.0F, 0, 5, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.0165F, 4.9334F, 1.9325F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.3709F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 11, 36, -0.5F, -2.0F, 0.0F, 3, 2, 2, 0.003F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0165F, 4.9334F, 1.9325F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.2051F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 12, -0.5F, -2.0F, -6.0F, 3, 2, 6, -0.003F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.7335F, 2.8906F, -1.6353F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.5175F, 0.5467F, -0.2877F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 0, 21, 0.0F, -1.0F, 0.0F, 0, 2, 5, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.7665F, 2.8906F, -1.6353F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.5175F, -0.5467F, 0.2877F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 0, 21, 0.0F, -1.0F, 0.0F, 0, 2, 5, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.0165F, 2.3801F, -4.0871F);
        this.main.addChild(jaw);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, -0.2309F, -0.6507F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.2487F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 39, 20, -0.5F, -0.125F, -1.75F, 2, 1, 3, -0.003F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, 1.3314F, 0.1454F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.4756F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 39, 5, -0.5F, -1.0F, -2.0F, 2, 1, 2, -0.006F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.0165F, 0.54F, 3.7175F);
        this.main.addChild(tail);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.5F, 3.6685F, -0.0209F);
        this.tail.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.8945F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 29, 39, 1.5F, -2.35F, 5.0F, 0, 2, 1, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 28, 27, 0.5F, -3.0F, 2.0F, 2, 3, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.0F, 1.2519F, 2.5598F);
        this.tail.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 1.069F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 22, 30, 1.0F, -0.925F, -1.2F, 0, 1, 2, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.0494F, 2.0472F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 11, 26, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 19, 0, 0.0F, -2.5F, 0.0F, 0, 5, 5, 0.0F, false));

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
        this.main.offsetX = 0.4F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 6.0F;
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

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.25F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);

            this.walk(frontLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(frontRightFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontRightFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);


            this.swing(main, speed, 0.3F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(270);
                this.main.offsetX = 0.0F;
                 this.main.offsetY = 0.250F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
