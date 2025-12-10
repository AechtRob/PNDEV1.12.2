package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelRostropycnodus extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer spike;
    private final AdvancedModelRenderer spike2;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer backspine;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer backspine2;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer tail3;

    public ModelRostropycnodus() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 17, 0, -1.0F, -1.6F, -3.0F, 2, 1, 5, 0.006F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -1.5F, -5.6F, -3.0F, 3, 4, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -4.1604F, -8.1632F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 18, -0.5F, -1.0F, 0.0F, 1, 1, 4, -0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -4.8525F, -9.6425F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2182F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 39, 11, 0.5F, -0.3F, 2.6F, 0, 1, 3, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 13, 18, 0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -7.8241F, -1.5478F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.0603F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 9, 33, -0.5F, 0.0F, -1.0F, 1, 1, 3, -0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -6.5859F, -3.1184F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.6676F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 30, 7, -0.5F, 0.0F, -0.4F, 1, 2, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -0.3553F, -3.2392F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.6537F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 36, 37, -0.5F, 0.0F, 0.0F, 2, 3, 1, -0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -1.9259F, -4.4774F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.6676F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 33, 32, -0.5F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -6.6642F, -2.881F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3185F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 13, 25, -0.5F, 0.0F, -3.0F, 2, 4, 3, 0.003F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.525F, -5.7334F, -2.0467F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0436F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 17, 7, -1.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 17, 7, 0.05F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -7.1F, 2.1F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 10, -0.5F, 0.0F, -5.0F, 2, 2, 5, 0.0F, false));

        this.spike = new AdvancedModelRenderer(this);
        this.spike.setRotationPoint(1.0F, -1.7F, 1.5F);
        this.main.addChild(spike);
        this.setRotateAngle(spike, -0.5763F, 0.4063F, -0.4128F);
        this.spike.cubeList.add(new ModelBox(spike, 35, 24, -0.5F, 0.0F, -1.0F, 1, 1, 3, 0.0F, false));

        this.spike2 = new AdvancedModelRenderer(this);
        this.spike2.setRotationPoint(-1.0F, -1.7F, 1.5F);
        this.main.addChild(spike2);
        this.setRotateAngle(spike2, -0.5763F, -0.4063F, 0.4128F);
        this.spike2.cubeList.add(new ModelBox(spike2, 35, 24, -0.5F, 0.0F, -1.0F, 1, 1, 3, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -4.2254F, -5.1863F);
        this.main.addChild(jaw);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 1.0368F, -2.3145F);
        this.jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1745F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 24, 32, -0.5F, -1.0F, 0.0F, 1, 1, 3, -0.013F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.1639F, -4.0974F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 30, 13, -0.5F, 0.025F, 1.7F, 1, 1, 3, -0.009F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -3.9393F, 1.2429F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 18, -1.0F, -1.6357F, -0.0429F, 2, 3, 4, 0.006F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.5F, -3.1607F, 0.7571F);
        this.tail.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.4363F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 9, 38, 1.5F, -1.0F, 0.25F, 0, 1, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0F, -3.1607F, 0.7571F);
        this.tail.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.4189F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 24, 25, 0.5F, 0.0F, 0.025F, 1, 2, 4, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 1.1606F, 2.2677F);
        this.tail.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 1.2654F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 27, 37, -1.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 3.3393F, 0.7571F);
        this.tail.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.5672F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 35, -0.5F, -2.0F, 0.0F, 2, 2, 2, 0.003F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, 1.3393F, 3.4571F);
        this.tail.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.5672F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 24, 7, 1.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.0F, 2.3393F, 1.2321F);
        this.tail.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.5564F, 0.1166F, -0.1848F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 9, 26, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.0F, 2.3393F, 1.2321F);
        this.tail.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.5564F, -0.1166F, 0.1848F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 9, 26, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.backspine = new AdvancedModelRenderer(this);
        this.backspine.setRotationPoint(1.2469F, 1.3736F, 1.4007F);
        this.tail.addChild(backspine);
        this.setRotateAngle(backspine, -0.3404F, 0.2419F, -0.3565F);
        this.backspine.cubeList.add(new ModelBox(backspine, 15, 10, -1.0F, 0.0F, -1.0F, 1, 1, 6, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.backspine.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.3054F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 37, 18, -1.0F, 0.0F, -3.0F, 1, 1, 3, -0.003F, false));

        this.backspine2 = new AdvancedModelRenderer(this);
        this.backspine2.setRotationPoint(-1.2469F, 1.3736F, 1.4007F);
        this.tail.addChild(backspine2);
        this.setRotateAngle(backspine2, -0.3404F, -0.2419F, 0.3565F);
        this.backspine2.cubeList.add(new ModelBox(backspine2, 15, 10, 0.0F, 0.0F, -1.0F, 1, 1, 6, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.backspine2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.3054F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 37, 18, 0.0F, 0.0F, -3.0F, 1, 1, 3, -0.003F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 2.95F);
        this.tail.addChild(tail2);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -1.0357F, 3.0071F);
        this.tail2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1047F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 32, 0, -0.5F, 0.0F, -3.0F, 1, 2, 3, 0.006F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.0F, -3.1607F, -2.1929F);
        this.tail2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.4189F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 39, 6, 0.5F, 0.0F, 3.525F, 1, 2, 2, -0.003F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.05F, 2.5F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 26, 0.0F, -2.0F, 0.0F, 0, 4, 4, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.4F;
        this.main.offsetX = -0.2F;
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
            this.chainSwing(fishTail, speed, 0.35F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);

            this.walk(frontLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(frontRightFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontRightFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);



            this.swing(main, speed, 0.3F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(270);
//                this.main.offsetX = 0.40F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
