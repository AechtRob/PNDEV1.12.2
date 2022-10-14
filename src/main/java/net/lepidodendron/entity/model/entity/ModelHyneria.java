package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHyneria;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelHyneria extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body3_r1;
    private final AdvancedModelRenderer body2_r1;
    private final AdvancedModelRenderer pectoralfinL;
    private final AdvancedModelRenderer pectoralfinL2;
    private final AdvancedModelRenderer pectoralfinR;
    private final AdvancedModelRenderer pectoralfinR2;
    private final AdvancedModelRenderer pelvicfinL;
    private final AdvancedModelRenderer pelvicfinL2;
    private final AdvancedModelRenderer pelvicfinR;
    private final AdvancedModelRenderer pelvicfinR2;
    private final AdvancedModelRenderer dorsalfin1;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer headlow_r1;
    private final AdvancedModelRenderer head_r1;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer tooth3_r1;
    private final AdvancedModelRenderer tooth2_r1;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer jaw2_r1;
    private final AdvancedModelRenderer jaw1_r1;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer analfin;
    private final AdvancedModelRenderer dorsalfin2;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer tailfin;
    private final AdvancedModelRenderer finbase4_r1;
    private final AdvancedModelRenderer finbase3_r1;
    private final AdvancedModelRenderer finbase2_r1;
    private final AdvancedModelRenderer finbase1_r1;

    private ModelAnimator animator;

    public ModelHyneria() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, -6.0F);
        this.body.cubeList.add(new ModelBox(body, 44, 0, -5.0F, -9.0F, 8.5F, 10, 10, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -5.0F, -9.5F, 16.5F, 10, 11, 24, 0.0F, false));

        this.body3_r1 = new AdvancedModelRenderer(this);
        this.body3_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(body3_r1);
        this.setRotateAngle(body3_r1, -0.0436F, 0.0F, 0.0F);
        this.body3_r1.cubeList.add(new ModelBox(body3_r1, 56, 39, -4.5F, -0.25F, 8.75F, 9, 1, 8, 0.0F, false));

        this.body2_r1 = new AdvancedModelRenderer(this);
        this.body2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(body2_r1);
        this.setRotateAngle(body2_r1, 0.0436F, 0.0F, 0.0F);
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 72, 10, -4.5F, -8.75F, 9.0F, 9, 1, 8, 0.0F, false));

        this.pectoralfinL = new AdvancedModelRenderer(this);
        this.pectoralfinL.setRotationPoint(4.0F, -1.0F, 10.0F);
        this.body.addChild(pectoralfinL);
        this.setRotateAngle(pectoralfinL, -0.4363F, -0.7854F, 0.5236F);
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 45, 19, 0.0F, -1.0F, -1.0F, 5, 3, 2, 0.0F, false));

        this.pectoralfinL2 = new AdvancedModelRenderer(this);
        this.pectoralfinL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pectoralfinL.addChild(pectoralfinL2);
        this.pectoralfinL2.cubeList.add(new ModelBox(pectoralfinL2, 65, 87, 5.0F, -2.0F, 0.0F, 8, 5, 0, 0.0F, false));
        this.pectoralfinL2.cubeList.add(new ModelBox(pectoralfinL2, 18, 3, 5.0F, -0.5F, -0.5F, 2, 2, 1, 0.0F, false));

        this.pectoralfinR = new AdvancedModelRenderer(this);
        this.pectoralfinR.setRotationPoint(-4.0F, -1.0F, 10.0F);
        this.body.addChild(pectoralfinR);
        this.setRotateAngle(pectoralfinR, -0.4363F, 0.7854F, -0.5236F);
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 1, 19, -5.0F, -1.0F, -1.0F, 5, 3, 2, 0.0F, false));

        this.pectoralfinR2 = new AdvancedModelRenderer(this);
        this.pectoralfinR2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pectoralfinR.addChild(pectoralfinR2);
        this.pectoralfinR2.cubeList.add(new ModelBox(pectoralfinR2, 87, 61, -13.0F, -2.0F, 0.0F, 8, 5, 0, 0.0F, false));
        this.pectoralfinR2.cubeList.add(new ModelBox(pectoralfinR2, 18, 0, -7.0F, -0.5F, -0.5F, 2, 2, 1, 0.0F, false));

        this.pelvicfinL = new AdvancedModelRenderer(this);
        this.pelvicfinL.setRotationPoint(3.0F, -1.0F, 39.0F);
        this.body.addChild(pelvicfinL);
        this.setRotateAngle(pelvicfinL, -0.4363F, -0.7854F, 0.5236F);
        this.pelvicfinL.cubeList.add(new ModelBox(pelvicfinL, 44, 71, 1.0F, -1.0F, -1.0F, 4, 3, 2, 0.0F, false));

        this.pelvicfinL2 = new AdvancedModelRenderer(this);
        this.pelvicfinL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pelvicfinL.addChild(pelvicfinL2);
        this.pelvicfinL2.cubeList.add(new ModelBox(pelvicfinL2, 26, 87, 5.0F, -2.0F, 0.0F, 8, 5, 0, 0.0F, false));
        this.pelvicfinL2.cubeList.add(new ModelBox(pelvicfinL2, 0, 3, 5.0F, -0.5F, -0.5F, 2, 2, 1, 0.0F, false));

        this.pelvicfinR = new AdvancedModelRenderer(this);
        this.pelvicfinR.setRotationPoint(-3.0F, -1.0F, 39.0F);
        this.body.addChild(pelvicfinR);
        this.setRotateAngle(pelvicfinR, -0.4363F, 0.7854F, -0.5236F);
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 0, 66, -5.0F, -1.0F, -1.0F, 4, 3, 2, 0.0F, false));

        this.pelvicfinR2 = new AdvancedModelRenderer(this);
        this.pelvicfinR2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pelvicfinR.addChild(pelvicfinR2);
        this.pelvicfinR2.cubeList.add(new ModelBox(pelvicfinR2, 30, 46, -13.0F, -2.0F, 0.0F, 8, 5, 0, 0.0F, false));
        this.pelvicfinR2.cubeList.add(new ModelBox(pelvicfinR2, 0, 0, -7.0F, -0.5F, -0.5F, 2, 2, 1, 0.0F, false));

        this.dorsalfin1 = new AdvancedModelRenderer(this);
        this.dorsalfin1.setRotationPoint(0.0F, -9.0F, 40.0F);
        this.body.addChild(dorsalfin1);
        this.setRotateAngle(dorsalfin1, -0.3491F, 0.0F, 0.0F);
        this.dorsalfin1.cubeList.add(new ModelBox(dorsalfin1, 16, 18, -0.5F, -2.5F, -1.0F, 1, 3, 2, 0.0F, false));
        this.dorsalfin1.cubeList.add(new ModelBox(dorsalfin1, 40, 48, 0.0F, -8.5F, -1.0F, 0, 8, 6, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -4.0F, 9.0F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 51, 71, -4.5F, -4.0F, -6.5F, 9, 8, 6, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 98, -4.5F, -4.0F, -0.5F, 9, 8, 2, 0.0F, false));

        this.headlow_r1 = new AdvancedModelRenderer(this);
        this.headlow_r1.setRotationPoint(0.0F, 4.0F, -9.0F);
        this.head.addChild(headlow_r1);
        this.setRotateAngle(headlow_r1, -0.0873F, 0.0F, 0.0F);
        this.headlow_r1.cubeList.add(new ModelBox(headlow_r1, 72, 0, -3.5F, -1.0F, 2.5F, 7, 1, 6, 0.0F, false));

        this.head_r1 = new AdvancedModelRenderer(this);
        this.head_r1.setRotationPoint(0.0F, 4.0F, -9.0F);
        this.head.addChild(head_r1);
        this.setRotateAngle(head_r1, 0.1309F, 0.0F, 0.0F);
        this.head_r1.cubeList.add(new ModelBox(head_r1, 30, 35, -2.5F, -8.0F, -6.5F, 5, 3, 16, 0.0F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 2.25F, -5.25F);
        this.head.addChild(upperjaw);
        this.setRotateAngle(upperjaw, -0.0873F, 0.0F, 0.0F);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 18, 54, -2.5F, -4.0F, -12.0F, 5, 4, 12, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 44, 0, -1.5F, -0.25F, -11.75F, 3, 1, 0, 0.0F, false));

        this.tooth3_r1 = new AdvancedModelRenderer(this);
        this.tooth3_r1.setRotationPoint(0.0F, 5.0F, -4.0F);
        this.upperjaw.addChild(tooth3_r1);
        this.setRotateAngle(tooth3_r1, 0.0F, -0.1745F, 0.0F);
        this.tooth3_r1.cubeList.add(new ModelBox(tooth3_r1, 0, 4, -3.25F, -5.35F, -7.0F, 0, 1, 10, 0.0F, false));
        this.tooth3_r1.cubeList.add(new ModelBox(tooth3_r1, 56, 22, -4.0F, -9.01F, -7.5F, 2, 4, 13, 0.0F, false));

        this.tooth2_r1 = new AdvancedModelRenderer(this);
        this.tooth2_r1.setRotationPoint(0.0F, 5.0F, -4.0F);
        this.upperjaw.addChild(tooth2_r1);
        this.setRotateAngle(tooth2_r1, 0.0F, 0.1745F, 0.0F);
        this.tooth2_r1.cubeList.add(new ModelBox(tooth2_r1, 0, 5, 3.25F, -5.35F, -7.0F, 0, 1, 10, 0.0F, false));
        this.tooth2_r1.cubeList.add(new ModelBox(tooth2_r1, 0, 59, 2.0F, -9.01F, -7.5F, 2, 4, 13, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.75F, -7.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 44, 0, -1.5F, -0.75F, -9.75F, 3, 1, 0, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 73, 19, -2.0F, 0.0F, -10.0F, 4, 2, 11, 0.0F, false));

        this.jaw2_r1 = new AdvancedModelRenderer(this);
        this.jaw2_r1.setRotationPoint(0.0F, 2.0F, -2.0F);
        this.jaw.addChild(jaw2_r1);
        this.setRotateAngle(jaw2_r1, 0.0F, 0.1745F, 0.0F);
        this.jaw2_r1.cubeList.add(new ModelBox(jaw2_r1, 75, 48, 1.5F, -2.01F, -7.5F, 2, 2, 11, 0.0F, false));
        this.jaw2_r1.cubeList.add(new ModelBox(jaw2_r1, 0, 7, 3.0F, -2.76F, -7.5F, 0, 1, 10, 0.0F, false));

        this.jaw1_r1 = new AdvancedModelRenderer(this);
        this.jaw1_r1.setRotationPoint(0.0F, 2.0F, -2.0F);
        this.jaw.addChild(jaw1_r1);
        this.setRotateAngle(jaw1_r1, 0.0F, -0.1745F, 0.0F);
        this.jaw1_r1.cubeList.add(new ModelBox(jaw1_r1, 70, 74, -3.5F, -2.01F, -7.5F, 2, 2, 11, 0.0F, false));
        this.jaw1_r1.cubeList.add(new ModelBox(jaw1_r1, 0, 6, -3.0F, -2.76F, -7.5F, 0, 1, 10, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -5.0F, 40.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 52, 54, -4.0F, -4.25F, 0.5F, 8, 10, 7, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 23, 70, -3.5F, -4.249F, 0.5F, 7, 10, 7, 0.0F, false));

        this.analfin = new AdvancedModelRenderer(this);
        this.analfin.setRotationPoint(0.0F, 4.0F, 7.0F);
        this.body3.addChild(analfin);
        this.setRotateAngle(analfin, 0.2618F, 0.0F, 0.0F);
        this.analfin.cubeList.add(new ModelBox(analfin, 0, 59, -0.5F, -0.75F, -1.5F, 1, 4, 3, 0.0F, false));
        this.analfin.cubeList.add(new ModelBox(analfin, 30, 28, 0.0F, 0.25F, -1.5F, 0, 11, 7, 0.0F, false));

        this.dorsalfin2 = new AdvancedModelRenderer(this);
        this.dorsalfin2.setRotationPoint(0.0F, -3.0F, 7.0F);
        this.body3.addChild(dorsalfin2);
        this.setRotateAngle(dorsalfin2, -0.2618F, 0.0F, 0.0F);
        this.dorsalfin2.cubeList.add(new ModelBox(dorsalfin2, 17, 59, -0.5F, -4.0F, -1.5F, 1, 4, 3, 0.0F, false));
        this.dorsalfin2.cubeList.add(new ModelBox(dorsalfin2, 51, 78, 0.0F, -11.75F, -1.5F, 0, 11, 7, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 7.25F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 0, -3.0F, -3.75F, 0.25F, 6, 8, 6, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 6.25F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 76, -2.5F, -3.751F, 0.0F, 5, 8, 6, 0.0F, false));

        this.tailfin = new AdvancedModelRenderer(this);
        this.tailfin.setRotationPoint(0.0F, 0.0F, 5.75F);
        this.body5.addChild(tailfin);
        this.tailfin.cubeList.add(new ModelBox(tailfin, 0, 20, 0.0F, -11.75F, -0.25F, 0, 24, 15, 0.0F, false));

        this.finbase4_r1 = new AdvancedModelRenderer(this);
        this.finbase4_r1.setRotationPoint(0.0F, 5.0F, -62.25F);
        this.tailfin.addChild(finbase4_r1);
        this.setRotateAngle(finbase4_r1, 0.0873F, 0.0F, 0.0F);
        this.finbase4_r1.cubeList.add(new ModelBox(finbase4_r1, 75, 61, -0.49F, 0.5F, 66.0F, 1, 3, 10, 0.0F, false));

        this.finbase3_r1 = new AdvancedModelRenderer(this);
        this.finbase3_r1.setRotationPoint(0.0F, 5.0F, -62.25F);
        this.tailfin.addChild(finbase3_r1);
        this.setRotateAngle(finbase3_r1, -0.0873F, 0.0F, 0.0F);
        this.finbase3_r1.cubeList.add(new ModelBox(finbase3_r1, 82, 32, -0.5F, -12.75F, 65.5F, 1, 3, 10, 0.0F, false));

        this.finbase2_r1 = new AdvancedModelRenderer(this);
        this.finbase2_r1.setRotationPoint(0.0F, 6.0F, -62.25F);
        this.tailfin.addChild(finbase2_r1);
        this.setRotateAngle(finbase2_r1, 0.3491F, 0.0F, 0.0F);
        this.finbase2_r1.cubeList.add(new ModelBox(finbase2_r1, 17, 87, -1.0F, 15.0F, 59.5F, 2, 5, 5, 0.0F, false));

        this.finbase1_r1 = new AdvancedModelRenderer(this);
        this.finbase1_r1.setRotationPoint(0.0F, 6.0F, -62.25F);
        this.tailfin.addChild(finbase1_r1);
        this.setRotateAngle(finbase1_r1, -0.3491F, 0.0F, 0.0F);
        this.finbase1_r1.cubeList.add(new ModelBox(finbase1_r1, 85, 74, -1.5F, -30.75F, 55.5F, 3, 5, 5, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 0.680F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.render(0.01F);
        GlStateManager.enableCull();
        //GlStateManager.disableBlend();
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

        this.body.offsetY = 0.25F;

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5, this.tailfin};

        float speed = 0.16F;

        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 3F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        if (!e.isInWater()) {
            speed = 0.20F;
        }

        //this.head.rotateAngleY += (f3 / (180F / (float) Math.PI));
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.43F * still, -0.65, f2, 0.5F * still);
            this.swing(body, speed, 0.1F * still, true, 0, 0, f2, 0.7F * still);
        }
        else {
            this.swing(body, speed, 0.06F, true, 0, 0, f2, 0.5F);
        }
        this.flap(pectoralfinL, (float) (speed * 0.65), 0.2F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinL, (float) (speed * 0.65), 0.1F, true, 0, 0, f2, 0.5F);
        this.swing(pectoralfinL2, (float) (speed * 0.65), 0.1F, true, 0.5F, 0, f2, 0.5F);
        this.flap(pectoralfinR, (float) (speed * 0.65), -0.2F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinR, (float) (speed * 0.65), -0.1F, true, 0, 0, f2, 0.5F);
        this.swing(pectoralfinR2, (float) (speed * 0.65), -0.1F, true, 0.5F, 0, f2, 0.5F);

        this.flap(pelvicfinL, (float) (speed * 0.65), 0.2F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinL, (float) (speed * 0.65), 0.1F, true, 1, 0, f2, 0.5F);
        this.swing(pelvicfinL2, (float) (speed * 0.65), 0.1F, true, 1.5F, 0, f2, 0.5F);
        this.flap(pelvicfinR, (float) (speed * 0.65), -0.2F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinR, (float) (speed * 0.65), -0.1F, true, 1, 0, f2, 0.5F);
        this.swing(pelvicfinR2, (float) (speed * 0.65), -0.1F, true, 1.5F, 0, f2, 0.5F);

        if (!e.isInWater()) {
            this.body.rotateAngleZ = (float) Math.toRadians(90);
            this.body.offsetY = 0.22F;
            this.bob(body, -speed * 1.8F, 1.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.5F, 0.02F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.2F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraHyneria e = (EntityPrehistoricFloraHyneria) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.head, 0,0,-0.5F);
        animator.rotate(this.head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

