package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelSigmapycnodus extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer tail4;

    public ModelSigmapycnodus() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.5F, -15.0F, -8.0F, 5, 13, 8, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 42, -2.0F, -13.625F, -12.25F, 4, 9, 5, 0.003F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -5.9315F, -15.1817F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.789F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 66, 61, -0.5F, 0.1F, -2.1F, 2, 2, 2, 0.003F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 67, 0, -1.0F, 0.0F, -2.0F, 3, 3, 2, 0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, -8.5143F, -11.8158F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.4399F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 66, -0.5F, -3.0F, -3.0F, 3, 3, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -11.2414F, -15.0658F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.6581F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 43, 66, -1.5F, 0.0F, -3.0F, 3, 3, 3, 0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, -13.5396F, -13.1375F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.8727F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 65, 24, -0.5F, 0.0F, -3.0F, 3, 3, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, -15.8339F, -9.8608F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.6109F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 61, 46, -0.5F, 0.0F, -4.0F, 3, 3, 4, 0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -16.8691F, -5.9971F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2618F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 27, 14, -1.5F, 0.0F, -4.0F, 4, 3, 4, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -17.0F, -3.0F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 46, 14, -1.5F, 0.0F, -3.0F, 4, 3, 6, 0.003F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.5F, -1.5F, -8.0F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1571F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 50, 0, -0.5F, -4.0F, -3.425F, 4, 4, 4, -0.003F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -1.5F, -8.0F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2443F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 21, 22, -1.5F, -3.0F, -0.425F, 4, 3, 8, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(2.5F, -4.0F, -7.0F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.1215F, 0.253F, 0.013F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 67, 66, 0.0F, -1.0F, 0.0F, 0, 2, 3, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-2.5F, -4.0F, -7.0F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.1215F, -0.253F, -0.013F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 67, 66, 0.0F, -1.0F, 0.0F, 0, 2, 3, 0.0F, true));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(1.7F, -10.8616F, -12.523F);
        this.main.addChild(eye);
        this.setRotateAngle(eye, 0.3927F, 0.0F, 0.0F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.95F, -0.3798F, -2.5428F);
        this.eye.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 1.6581F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 13, 70, 0.4F, 1.5F, -1.6F, 1, 2, 2, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 34, 54, 0.5F, 2.0F, -1.1F, 1, 1, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-1.7F, -10.8616F, -12.523F);
        this.main.addChild(eye2);
        this.setRotateAngle(eye2, 0.3927F, 0.0F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.95F, -0.3798F, -2.5428F);
        this.eye2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 1.6581F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 13, 70, -1.4F, 1.5F, -1.6F, 1, 2, 2, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 34, 54, -1.5F, 2.0F, -1.1F, 1, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -4.681F, -11.3478F);
        this.main.addChild(jaw);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 2.6546F, -2.9681F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 1.5708F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 34, 48, -0.5F, 0.0F, 0.0F, 2, 4, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0F, -1.2506F, -3.8338F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 1.789F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 50, 9, -0.5F, 2.0F, -2.75F, 3, 2, 2, -0.006F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 63, 43, 0.0F, 0.1F, -3.4F, 2, 0, 2, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 67, 20, 0.0F, 0.3F, -2.8F, 2, 2, 1, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 66, 54, -0.5F, 0.0F, -4.0F, 3, 4, 2, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -8.9874F, -0.172F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 22, -2.0F, -5.3126F, -0.828F, 4, 13, 6, -0.003F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-2.5F, -7.6817F, 1.0561F);
        this.tail.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.6981F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 32, 66, 2.475F, -3.0F, 0.0F, 0, 3, 5, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.0F, -8.1435F, 0.1691F);
        this.tail.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.48F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 46, 24, -0.5F, 0.0F, 0.0F, 3, 3, 6, 0.003F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, 9.2152F, 3.5206F);
        this.tail.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.288F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 61, 9, -1.0F, -2.0F, 0.0F, 3, 2, 2, -0.003F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, 9.3199F, -0.478F);
        this.tail.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0262F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 17, 63, -1.0F, -2.0F, 0.0F, 3, 2, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 21, 34, -1.5F, -0.8126F, -1.328F, 3, 6, 7, 0.006F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.5F, -5.373F, -0.0088F);
        this.tail2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.6545F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 51, 57, 1.5F, -1.0F, 0.0F, 0, 1, 7, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 27, 0, 0.0F, 0.0F, 0.0F, 3, 5, 8, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-2.0F, 8.6472F, -0.0618F);
        this.tail2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.4625F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 63, 34, 2.025F, 0.0F, 1.0F, 0, 2, 6, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 42, 34, 0.5F, -4.0F, 0.0F, 3, 4, 7, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 42, 46, -1.0F, 0.6874F, -0.828F, 2, 3, 7, 0.006F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, -1.1117F, 0.0447F);
        this.tail3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.3491F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 34, 57, -0.5F, 0.0F, 0.0F, 2, 2, 6, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.0F, 5.92F, -0.1922F);
        this.tail3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.3752F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 57, 0.0F, -2.0F, 0.25F, 2, 2, 6, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 67, 14, 1.0F, 0.0F, 0.25F, 0, 1, 4, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 56, 66, -0.5F, 1.0874F, -0.828F, 1, 2, 4, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 19, 48, 0.0F, -1.4126F, 0.172F, 0, 7, 7, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.65F;
        this.main.offsetX = -0.0F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 1.5F;
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
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};
        float speed = 0.2F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.35F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);

            this.walk(frontLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(frontRightFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontRightFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);



            this.swing(main, speed, 0.3F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(270);
                this.main.offsetX = 0.40F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
