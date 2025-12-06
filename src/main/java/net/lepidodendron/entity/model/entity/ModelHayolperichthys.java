package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelHayolperichthys extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer tail4;

    public ModelHayolperichthys() {
        this.textureWidth = 50;
        this.textureHeight = 50;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 25.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.0F, -6.6F, -2.025F, 4, 5, 4, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 10, -2.0F, -6.1F, -6.0F, 4, 4, 4, -0.003F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 25, -1.5F, -5.6F, -8.975F, 3, 2, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -1.2579F, -2.0899F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 17, 13, -0.5F, -1.0F, 0.0F, 3, 1, 4, 0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -1.6065F, -6.0747F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2618F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 31, -0.5F, -2.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.5F, -1.7162F, 0.4486F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2053F, -0.4647F, 0.1244F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 11, 32, -0.5F, -0.425F, -0.5F, 1, 1, 4, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.5F, -1.8162F, -1.1514F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -0.4451F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 32, 6, -0.55F, -0.5F, -2.0F, 1, 1, 4, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.5F, -1.7162F, -3.5514F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -1.0551F, -0.4937F, 0.6963F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 32, 0, -0.5F, -0.7F, -0.6F, 1, 1, 4, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.5F, -1.7162F, 0.4486F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2053F, 0.4647F, -0.1244F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 11, 32, -0.5F, -0.425F, -0.5F, 1, 1, 4, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.05F, -5.8162F, 0.8486F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0315F, -0.2947F, -0.0814F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 43, 0, 0.0F, 0.0F, -0.25F, 0, 1, 3, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(2.05F, -5.8162F, 0.8486F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0315F, 0.2947F, 0.0814F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 43, 0, 0.0F, 0.0F, -0.25F, 0, 1, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.5F, -1.8162F, -1.1514F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.4451F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 32, 6, -0.45F, -0.5F, -2.0F, 1, 1, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.5F, -1.7162F, -3.5514F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -1.0551F, 0.4937F, -0.6963F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 32, 0, -0.5F, -0.7F, -0.6F, 1, 1, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, -1.6F, -6.0F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 17, 7, -0.5F, -1.0F, -0.075F, 3, 1, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -3.4615F, -10.143F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1745F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 33, 37, -0.5F, -0.85F, -0.625F, 2, 1, 3, 0.003F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, -3.4615F, -10.143F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3491F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 39, 27, -0.5F, -1.0F, 1.0F, 2, 1, 1, -0.006F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 11, 38, 0.0F, -0.975F, -3.0F, 1, 1, 3, 0.006F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -6.3489F, -8.8535F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.829F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 22, 37, -0.5F, 0.0F, -3.0F, 2, 1, 3, -0.003F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, -7.251F, -5.9924F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.3054F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 28, 19, -0.5F, 0.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, -7.4255F, -1.9962F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0436F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 17, 0, -0.5F, 0.0F, -4.0F, 3, 2, 4, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0F, -7.4255F, -1.9962F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0436F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 19, -0.5F, 0.0F, 0.0F, 3, 1, 4, 0.003F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(1.5125F, -5.7706F, -5.7916F);
        this.main.addChild(eye);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.3875F, 0.1706F, -0.2084F);
        this.eye.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.3054F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 43, 13, -1.875F, -0.6F, -0.25F, 1, 1, 1, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 29, 42, -1.9F, -1.1F, -0.75F, 1, 2, 2, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-1.5125F, -5.7706F, -5.7916F);
        this.main.addChild(eye2);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.3875F, 0.1706F, -0.2084F);
        this.eye2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.3054F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 43, 13, 0.875F, -0.6F, -0.25F, 1, 1, 1, 0.0F, true));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 29, 42, 0.9F, -1.1F, -0.75F, 1, 2, 2, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -3.4638F, -8.5317F);
        this.main.addChild(jaw);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.9693F, -3.1037F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0436F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 12, 43, -0.5F, -1.0F, 0.025F, 1, 1, 1, -0.003F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 37, -1.0F, -1.0F, 1.0F, 2, 1, 3, -0.006F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0272F, -1.3114F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1309F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 45, 40, -0.5F, -0.45F, -1.775F, 1, 1, 0, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 43, 10, -0.5F, -0.3F, -1.875F, 1, 1, 1, 0.003F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 32, 12, -1.0F, -0.3F, -0.9F, 2, 1, 3, -0.003F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -4.0874F, 1.5191F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 15, 19, -1.5F, -1.5126F, -0.0191F, 3, 3, 3, -0.003F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.0F, 2.4809F, 0.3757F);
        this.tail.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1963F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 26, 26, -0.5F, -1.025F, -0.175F, 3, 1, 3, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-2.5F, -3.1636F, 0.4809F);
        this.tail.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.3316F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 36, 42, 2.5F, -1.0F, 0.5F, 0, 1, 3, 0.0F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 13, 26, 1.0F, 0.0F, 0.0F, 3, 2, 3, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.425F, 1.6809F, 0.6257F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.4759F, 0.286F, -0.2729F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 7, 43, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.425F, 1.6809F, 0.6257F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.4759F, -0.286F, 0.2729F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 7, 43, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.1888F, 3.306F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 39, 17, -1.0F, -0.9514F, -0.8252F, 2, 2, 2, -0.006F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-2.5F, 1.7307F, -0.2893F);
        this.tail2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.3491F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 43, 5, 2.5F, -0.05F, 0.45F, 0, 1, 3, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 37, 31, 1.5F, -1.05F, -0.3F, 2, 1, 3, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.5F, -2.3757F, 0.0114F);
        this.tail2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.4189F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 26, 31, 0.5F, 0.025F, -0.1F, 2, 2, 3, -0.003F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.1982F, 1.6106F);
        this.tail2.addChild(tail3);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.0F, -0.7532F, 0.5643F);
        this.tail3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.2182F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 39, 22, 0.5F, -0.325F, -0.5F, 1, 1, 3, -0.006F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.0F, 1.4768F, 0.7343F);
        this.tail3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1047F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 20, 42, 0.5F, -1.525F, -0.625F, 1, 1, 3, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.2532F, 2.8143F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 42, 0.0F, -1.25F, 0.0F, 0, 3, 3, 0.0F, false));

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
        this.main.offsetX = -0.4F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 4.0F;
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
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.35F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);

            this.walk(backLeftFin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.swing(backLeftFin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.walk(backRightFin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.swing(backRightFin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);


            this.swing(main, speed, 0.3F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(270);
                this.main.offsetX = 0.40F;
                 this.main.offsetY = -0.1F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
