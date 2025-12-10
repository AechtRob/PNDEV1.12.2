package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEubiodectes extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer pectoralfinright;

    private ModelAnimator animator;

    public ModelEubiodectes() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 19.5F, -2.25F);
        this.main.cubeList.add(new ModelBox(main, 25, 0, -2.5F, -1.05F, -6.35F, 5, 4, 6, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.0F, -2.4F, -0.5F, 4, 6, 8, 0.006F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.5F, 0.5139F, -10.7816F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.8211F, -0.0689F, 0.1176F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 21, 56, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.003F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.5906F, 0.4524F, -9.3717F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.4284F, -0.0689F, 0.1176F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 34, 11, 0.0F, 0.0F, -1.0F, 1, 2, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.5906F, 0.4524F, -9.3717F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.4284F, 0.0689F, -0.1176F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 34, 11, -1.0F, 0.0F, -1.0F, 1, 2, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.5F, 0.5139F, -10.7816F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.9956F, -0.0689F, 0.1176F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 40, 29, 0.8F, 0.05F, -0.3F, 0, 1, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.5F, 0.5139F, -10.7816F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.9956F, 0.0689F, -0.1176F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 40, 29, -0.8F, 0.05F, -0.3F, 0, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.5F, 0.5139F, -10.7816F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.8211F, 0.0689F, -0.1176F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 21, 56, -1.0F, 0.0F, 0.0F, 1, 1, 1, -0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -0.3294F, -10.2443F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 1.0036F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 25, 11, -2.0F, 0.0F, -1.0F, 3, 2, 1, -0.003F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.2552F, -8.9489F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0436F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 57, 7, -1.65F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 57, 7, 0.65F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 1.0589F, -7.6982F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2618F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 48, 0, -2.0F, -2.0F, -2.1F, 3, 3, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -2.0514F, -4.4848F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3054F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 40, 20, -2.0F, 0.0F, -4.0F, 4, 4, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -2.4F, -0.5F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 19, 42, -2.0F, 0.0F, -4.0F, 4, 2, 4, 0.003F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, 4.2274F, -6.4591F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2967F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 13, 49, -2.0F, -3.0F, -3.0F, 3, 3, 3, 0.003F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 4.5675F, -0.4687F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0567F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 23, 33, -2.0F, -2.0F, -6.0F, 4, 2, 6, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, 3.85F, 7.5F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0742F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 28, -1.0F, -0.875F, -8.0F, 3, 1, 8, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 3.205F, -9.1791F);
        this.main.addChild(jaw);
        this.setRotateAngle(jaw, -0.2182F, 0.0F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.3305F, -0.2045F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.5803F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 26, 49, -1.0F, -1.225F, -2.6F, 2, 1, 1, -0.003F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.3308F, -0.2176F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.6676F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 9, 56, -0.7F, -1.425F, -2.55F, 0, 1, 3, 0.0F, true));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 9, 56, 0.7F, -1.425F, -2.55F, 0, 1, 3, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.3308F, -0.2176F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.5803F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 48, 7, -1.0F, -1.225F, -2.0F, 2, 1, 2, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(0.75F, 3.7F, 7.0F);
        this.main.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 0.0F, 0.0F, -0.3491F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.0F, 0.75F, 1.85F);
        this.pelvicfinleft.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.829F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 19, 38, -1.0F, -2.0F, -1.0F, 0, 2, 1, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-0.75F, 3.7F, 7.0F);
        this.main.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 0.0F, 0.0F, 0.3491F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.0F, 0.75F, 1.85F);
        this.pelvicfinright.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.829F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 19, 38, 1.0F, -2.0F, -1.0F, 0, 2, 1, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.5F, 7.5F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 15, -1.5F, -0.925F, -1.125F, 3, 4, 8, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 3.6513F, 3.3626F);
        this.tail.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3054F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 37, 52, 0.0F, 0.0F, 0.0F, 0, 2, 4, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.5F, 4.475F, 0.0F);
        this.tail.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.2007F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 38, -1.5F, -2.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -1.9F, 0.0F);
        this.tail.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0873F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 40, 11, -1.0F, 0.0F, 0.0F, 2, 1, 7, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.35F, 7.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 44, 29, -1.0F, -0.75F, -0.35F, 2, 2, 5, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -1.5489F, 2.0742F);
        this.tail2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0436F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 16, 56, -0.025F, -0.925F, -0.3F, 0, 1, 2, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -1.5854F, -0.1616F);
        this.tail2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.48F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 44, 37, 0.0F, -2.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.5F, 2.7294F, -0.1405F);
        this.tail2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.24F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 49, 51, 1.475F, -0.5F, 0.0F, 0, 1, 5, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 48, 1.0F, -2.0F, 0.0F, 1, 2, 5, 0.003F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, -1.6399F, -0.0266F);
        this.tail2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.1047F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 49, 44, 0.0F, 0.025F, -0.175F, 1, 1, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 4.65F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 56, -0.5F, -0.7423F, -0.404F, 1, 1, 3, 0.006F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(1.0F, 1.291F, 0.0662F);
        this.tail3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.3272F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 26, 52, -1.5F, -1.075F, -0.025F, 1, 1, 4, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.5F, -1.3673F, 0.296F);
        this.tail3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0829F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 49, 37, 0.0F, 0.025F, -0.6F, 1, 1, 5, -0.003F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.5F, 3.75F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 23, 15, 0.0F, -4.0F, 0.0F, 0, 9, 8, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(2.0F, 2.45F, -3.85F);
        this.main.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, -0.7341F, 0.4462F, -0.363F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 36, 42, 0.0F, -1.5F, 0.0F, 0, 3, 6, 0.0F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-2.0F, 2.45F, -3.85F);
        this.main.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, -0.7341F, -0.4462F, 0.363F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 36, 42, 0.0F, -1.5F, 0.0F, 0, 3, 6, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.8F;
        this.main.offsetX = 0.258F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(235);
        this.main.rotateAngleX = (float)Math.toRadians(8);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 1.4F;
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
        this.main.offsetX = -0.14F;
        this.main.offsetY = -0.19F;
        this.main.offsetZ = 0.06F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.main.offsetY = -0.18F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }

    public void setRotateAngle(ModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        //this.head.offsetY = 0.8F;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.8F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.29F * still, -0.85, f2, 0.5F * still);
            this.swing(main, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(main, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(pectoralfinleft, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinleft, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(pectoralfinright, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinright, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(pelvicfinleft, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinleft, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(pelvicfinright, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinright, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.main.rotateAngleZ = (float) Math.toRadians(270);
//            this.body.offsetY = -0.05F;
//            this.body.offsetX = -0.5F;
            this.bob(main, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -3, f2, 1F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -3, f2, 1F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.jaw, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

