package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelCaturus extends AdvancedModelBase {
    private final AdvancedModelRenderer Caturus;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Cephalon;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer maxillae;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer PectoralR;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer PectoralL;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer VentralR;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer VentralL;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;

    private ModelAnimator animator;

    public ModelCaturus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Caturus = new AdvancedModelRenderer(this);
        this.Caturus.setRotationPoint(0.0F, 24.0F, -4.0F);


        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(1.0F, -5.4F, 2.4F);
        this.Caturus.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 33, 0, -3.2675F, -6.9F, 0.0F, 5, 11, 8, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5675F, -7.8F, 1.4F);
        this.Body1.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 64, 50, -1.7F, 0.0F, 0.3F, 3, 1, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5675F, -8.0F, 0.0F);
        this.Body1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.5149F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 64, 58, -1.7F, 1.0F, -0.6F, 3, 1, 2, 0.0F, false));

        this.Cephalon = new AdvancedModelRenderer(this);
        this.Cephalon.setRotationPoint(-1.0F, -0.6F, -0.1F);
        this.Body1.addChild(Cephalon);
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 61, 8, -1.7655F, -2.598F, -8.702F, 4, 4, 5, -0.01F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 28, 70, -1.7655F, 1.402F, -5.702F, 4, 1, 2, -0.01F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 12, 68, -1.7655F, -1.598F, -9.702F, 4, 2, 1, -0.01F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 7, 0, -0.7675F, -1.3067F, -13.9819F, 2, 2, 2, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 3, -0.2675F, 0.2933F, -13.1819F, 1, 1, 1, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 45, 56, -2.2675F, -3.3F, -3.9F, 5, 8, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5675F, -4.4F, -3.9F);
        this.Cephalon.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3752F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 68, -0.7F, 0.3F, -0.08F, 3, 3, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.2325F, -3.6F, -8.7F);
        this.Cephalon.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3665F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 53, 71, -1.5F, 0.4F, -5.2F, 3, 2, 5, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.2325F, -3.6F, -8.7F);
        this.Cephalon.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 71, 58, -1.5F, 0.4F, -0.1F, 3, 2, 5, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.2325F, 1.2F, -8.7F);
        this.Cephalon.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3491F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 45, -1.0F, -0.2F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.2325F, 1.2F, -8.7F);
        this.Cephalon.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 73, 25, -1.0F, -0.2F, -4.0F, 2, 1, 4, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 71, 18, -2.0F, -1.9F, -4.0F, 4, 2, 4, 0.0F, false));

        this.maxillae = new AdvancedModelRenderer(this);
        this.maxillae.setRotationPoint(0.8F, 1.2F, -8.7F);
        this.Cephalon.addChild(maxillae);
        this.setRotateAngle(maxillae, 0.2618F, 0.0F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5675F, 0.0F, -0.4F);
        this.maxillae.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.5585F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 58, 25, -2.0F, -1.9368F, -0.4241F, 4, 2, 6, 0.01F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.8F, 2.8F, -3.9F);
        this.Cephalon.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.2793F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 52, 0, -2.5675F, -0.2F, -5.04F, 4, 1, 6, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 47, 69, -2.0675F, -1.0F, -5.04F, 3, 1, 2, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 17, 0, -2.5675F, 0.6F, -5.04F, 4, 1, 6, 0.01F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 17, 8, -2.0455F, 0.602F, -9.042F, 3, 1, 4, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5675F, 0.0F, -8.96F);
        this.Jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3316F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -0.5F, -0.5819F, -0.8219F, 1, 1, 1, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 49, -1.0F, 0.3181F, -1.6219F, 2, 1, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5675F, 0.0F, -4.96F);
        this.Jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1047F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 42, 40, -1.0F, -1.0F, -4.08F, 2, 1, 4, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 10, 45, -1.5F, -0.2F, -4.08F, 3, 1, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5675F, 2.0F, -10.0F);
        this.Jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 32, 0, -0.978F, -1.198F, -0.062F, 2, 1, 2, -0.01F, false));

        this.PectoralR = new AdvancedModelRenderer(this);
        this.PectoralR.setRotationPoint(-3.0F, 3.0F, 2.0F);
        this.Body1.addChild(PectoralR);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5675F, 0.0F, 0.0F);
        this.PectoralR.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.7436F, -0.5148F, 0.4946F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 50, 10, 0.0F, -2.5F, -1.0F, 0, 4, 10, 0.0F, false));

        this.PectoralL = new AdvancedModelRenderer(this);
        this.PectoralL.setRotationPoint(1.3F, 3.0F, 2.0F);
        this.Body1.addChild(PectoralL);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5675F, 0.0F, 0.0F);
        this.PectoralL.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.7436F, 0.5148F, -0.4946F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 50, 10, 0.0F, -2.5F, -1.0F, 0, 4, 10, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 33, 20, -2.8675F, -7.0F, 0.0F, 4, 11, 8, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 45, -0.5675F, -17.0F, 0.0F, 0, 10, 9, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5675F, -7.5F, 0.0F);
        this.Body2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 58, 63, -1.7F, 0.0F, -0.3F, 3, 1, 6, 0.0F, false));

        this.VentralR = new AdvancedModelRenderer(this);
        this.VentralR.setRotationPoint(-2.5F, 3.0F, 5.0F);
        this.Body2.addChild(VentralR);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5675F, 0.0F, 0.0F);
        this.VentralR.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.8743F, -0.303F, 0.3195F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 71, 66, -0.1F, -1.8F, -0.8F, 0, 4, 6, 0.0F, false));

        this.VentralL = new AdvancedModelRenderer(this);
        this.VentralL.setRotationPoint(0.8F, 3.0F, 5.0F);
        this.Body2.addChild(VentralL);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5675F, 0.0F, 0.0F);
        this.VentralL.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.8743F, 0.303F, -0.3195F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 71, 66, 0.1F, -1.8F, -0.8F, 0, 4, 6, 0.0F, true));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 26, 40, -2.8675F, -7.0F, 0.0F, 4, 10, 7, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.1675F, 4.0F, 0.0F);
        this.Body3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1571F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 17, 70, -0.8F, -1.0F, 0.0F, 2, 1, 6, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, -1.0F, 7.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 49, 40, -2.3675F, -5.0F, 0.0F, 3, 8, 7, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5675F, -6.0F, 0.0F);
        this.Body4.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0698F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 23, 61, -1.3F, 0.5F, 0.0F, 2, 1, 7, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5675F, 4.0F, 0.0F);
        this.Body4.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2182F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 0, 0.0F, 0.0F, 0.0F, 0, 9, 6, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5675F, 4.0F, 0.0F);
        this.Body4.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1571F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 36, 69, -1.3F, -1.0F, 0.0F, 2, 1, 6, 0.0F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, -1.0F, 7.0F);
        this.Body4.addChild(Body5);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5675F, 4.0F, 0.0F);
        this.Body5.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.192F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 11, 57, -0.8F, -2.0F, 0.0F, 1, 2, 8, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5675F, 0.0F, 7.0F);
        this.Body5.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0436F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 0, -0.3F, -15.0F, 0.0F, 0, 28, 16, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.5675F, 0.0F, 4.6F);
        this.Body5.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0698F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 75, 0, -1.3F, -4.0F, -0.1F, 2, 6, 3, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5675F, 0.0F, 0.0F);
        this.Body5.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0349F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 63, 34, -1.3F, -4.0F, -0.5F, 2, 7, 5, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Caturus.render(f5 * 0.342F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.disableCull();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.Caturus.rotateAngleY = (float) Math.toRadians(90);
        this.Caturus.offsetX = -0.2F;
        this.Caturus.offsetY = -0.17F;
        this.Caturus.render(0.01F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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

        this.Caturus.offsetY = 1.0F;

        AdvancedModelRenderer[] fishTail = {this.Body2, this.Body3, this.Body4, this.Body5};

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
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
            this.swing(Caturus, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(Caturus, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(PectoralL, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(PectoralL, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(PectoralR, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(PectoralR, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(VentralL, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(VentralL, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(VentralR, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(VentralR, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.Caturus.rotateAngleZ = (float) Math.toRadians(90);
            this.Caturus.offsetY = 0.9F;
            this.bob(Caturus, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.Cephalon, 0,0,-0.5F);
        animator.rotate(this.Cephalon, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.maxillae, -(float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

