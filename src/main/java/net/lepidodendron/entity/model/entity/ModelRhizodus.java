package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraRhizodus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRhizodus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer bodybase;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer head_r1;
    private final AdvancedModelRenderer head_r2;
    private final AdvancedModelRenderer head_r3;
    private final AdvancedModelRenderer head_r4;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer tooth3_r1;
    private final AdvancedModelRenderer tooth2_r1;
    private final AdvancedModelRenderer head2_r1;
    private final AdvancedModelRenderer head1_r1;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer jaw2_r1;
    private final AdvancedModelRenderer jaw1_r1;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer pelvicfinR;
    private final AdvancedModelRenderer pelvicfinR2;
    private final AdvancedModelRenderer pelvicfinL;
    private final AdvancedModelRenderer pelvicfinL2;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer dorsalfin;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer fin;
    private final AdvancedModelRenderer finbase1_r1;
    private final AdvancedModelRenderer finbase3_r1;
    private final AdvancedModelRenderer finbase4_r1;
    private final AdvancedModelRenderer finbase2_r1;
    private final AdvancedModelRenderer dorsalfin2;
    private final AdvancedModelRenderer analfin;
    private final AdvancedModelRenderer pectoralfinL;
    private final AdvancedModelRenderer pectoralfinL2;
    private final AdvancedModelRenderer pectoralfinR;
    private final AdvancedModelRenderer pectoralfinR2;

    private ModelAnimator animator;

    public ModelRhizodus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.bodybase = new AdvancedModelRenderer(this);
        this.bodybase.setRotationPoint(0.0F, 24.0F, -22.0F);
        this.bodybase.cubeList.add(new ModelBox(bodybase, 82, 34, -5.5F, -9.5F, 8.5F, 11, 11, 6, 0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -3.0F, 9.0F);
        this.bodybase.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 112, -5.499F, -6.0F, -6.5F, 11, 10, 6, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 40, 115, -5.0F, -6.0F, -0.5F, 10, 10, 3, 0.0F, false));

        this.head_r1 = new AdvancedModelRenderer(this);
        this.head_r1.setRotationPoint(0.0F, 4.0F, -9.0F);
        this.head.addChild(head_r1);
        this.setRotateAngle(head_r1, 0.3491F, 0.0F, 0.0F);
        this.head_r1.cubeList.add(new ModelBox(head_r1, 36, 70, -3.49F, -10.05F, -6.65F, 7, 3, 5, 0.0F, false));

        this.head_r2 = new AdvancedModelRenderer(this);
        this.head_r2.setRotationPoint(0.0F, 2.0F, -9.0F);
        this.head.addChild(head_r2);
        this.setRotateAngle(head_r2, -0.0873F, 0.0F, 0.0F);
        this.head_r2.cubeList.add(new ModelBox(head_r2, 28, 58, -3.5F, 0.8F, 2.5F, 7, 1, 6, 0.0F, false));

        this.head_r3 = new AdvancedModelRenderer(this);
        this.head_r3.setRotationPoint(0.0F, 4.0F, -9.0F);
        this.head.addChild(head_r3);
        this.setRotateAngle(head_r3, 0.0436F, 0.0F, 0.0F);
        this.head_r3.cubeList.add(new ModelBox(head_r3, 28, 51, -4.0F, -10.0F, 3.0F, 8, 1, 6, 0.0F, false));

        this.head_r4 = new AdvancedModelRenderer(this);
        this.head_r4.setRotationPoint(0.0F, 4.0F, -9.0F);
        this.head.addChild(head_r4);
        this.setRotateAngle(head_r4, 0.1309F, 0.0F, 0.0F);
        this.head_r4.cubeList.add(new ModelBox(head_r4, 66, 65, -4.5F, -9.5F, -4.25F, 9, 5, 8, 0.0F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 2.25F, -8.0F);
        this.head.addChild(upperjaw);
        this.setRotateAngle(upperjaw, -0.0436F, 0.0F, 0.0F);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 0, 51, -3.5F, -5.0F, -11.0F, 7, 5, 14, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 0, 30, -2.0F, 0.0F, -10.15F, 4, 1, 0, 0.0F, false));

        this.tooth3_r1 = new AdvancedModelRenderer(this);
        this.tooth3_r1.setRotationPoint(0.0F, 5.0F, -4.0F);
        this.upperjaw.addChild(tooth3_r1);
        this.setRotateAngle(tooth3_r1, 0.0F, -0.0873F, 0.0F);
        this.tooth3_r1.cubeList.add(new ModelBox(tooth3_r1, 18, 21, -3.5F, -5.1F, -5.75F, 0, 1, 10, 0.0F, false));

        this.tooth2_r1 = new AdvancedModelRenderer(this);
        this.tooth2_r1.setRotationPoint(0.0F, 5.0F, -4.0F);
        this.upperjaw.addChild(tooth2_r1);
        this.setRotateAngle(tooth2_r1, 0.0F, 0.0873F, 0.0F);
        this.tooth2_r1.cubeList.add(new ModelBox(tooth2_r1, 0, 29, 3.5F, -5.1F, -5.75F, 0, 1, 10, 0.0F, false));

        this.head2_r1 = new AdvancedModelRenderer(this);
        this.head2_r1.setRotationPoint(0.0F, 5.0F, -4.0F);
        this.upperjaw.addChild(head2_r1);
        this.setRotateAngle(head2_r1, 0.0F, -0.1309F, 0.0F);
        this.head2_r1.cubeList.add(new ModelBox(head2_r1, 0, 18, -4.75F, -10.01F, -6.25F, 2, 5, 14, 0.0F, false));

        this.head1_r1 = new AdvancedModelRenderer(this);
        this.head1_r1.setRotationPoint(0.0F, 5.0F, -4.0F);
        this.upperjaw.addChild(head1_r1);
        this.setRotateAngle(head1_r1, 0.0F, 0.1309F, 0.0F);
        this.head1_r1.cubeList.add(new ModelBox(head1_r1, 42, 51, 2.75F, -10.01F, -6.25F, 2, 5, 14, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.5F, -5.5F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0436F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 34, 126, -2.0F, -2.75F, -12.75F, 4, 2, 0, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 60, 51, -3.0F, -0.75F, -13.0F, 6, 2, 12, 0.0F, false));

        this.jaw2_r1 = new AdvancedModelRenderer(this);
        this.jaw2_r1.setRotationPoint(0.0F, 1.25F, -6.0F);
        this.jaw.addChild(jaw2_r1);
        this.setRotateAngle(jaw2_r1, 0.0F, 0.0873F, 0.0F);
        this.jaw2_r1.cubeList.add(new ModelBox(jaw2_r1, 48, 70, 1.0F, -2.01F, -6.5F, 3, 2, 12, 0.0F, false));
        this.jaw2_r1.cubeList.add(new ModelBox(jaw2_r1, 62, 24, 3.25F, -3.01F, -6.25F, 0, 1, 10, 0.0F, false));

        this.jaw1_r1 = new AdvancedModelRenderer(this);
        this.jaw1_r1.setRotationPoint(0.0F, 1.25F, -6.0F);
        this.jaw.addChild(jaw1_r1);
        this.setRotateAngle(jaw1_r1, 0.0F, -0.0873F, 0.0F);
        this.jaw1_r1.cubeList.add(new ModelBox(jaw1_r1, 18, 70, -4.0F, -2.01F, -6.5F, 3, 2, 12, 0.0F, false));
        this.jaw1_r1.cubeList.add(new ModelBox(jaw1_r1, 20, 29, -3.25F, -3.01F, -6.5F, 0, 1, 10, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -4.0F, 14.5F);
        this.bodybase.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 21, 22, -5.5F, -5.5F, -0.5F, 11, 11, 18, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -1.0F, 17.5F);
        this.body.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 71, 100, -5.0F, -4.5F, -1.0F, 10, 11, 17, -0.01F, false));

        this.pelvicfinR = new AdvancedModelRenderer(this);
        this.pelvicfinR.setRotationPoint(-2.5F, 4.0F, 13.5F);
        this.body1.addChild(pelvicfinR);
        this.setRotateAngle(pelvicfinR, -0.4363F, 0.7854F, -0.5236F);
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 36, 78, -9.0F, -0.5F, -1.0F, 7, 2, 1, 0.0F, false));

        this.pelvicfinR2 = new AdvancedModelRenderer(this);
        this.pelvicfinR2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pelvicfinR.addChild(pelvicfinR2);
        this.pelvicfinR2.cubeList.add(new ModelBox(pelvicfinR2, 32, 0, -9.75F, -1.0F, -0.5F, 4, 3, 0, 0.0F, false));

        this.pelvicfinL = new AdvancedModelRenderer(this);
        this.pelvicfinL.setRotationPoint(2.5F, 4.0F, 13.5F);
        this.body1.addChild(pelvicfinL);
        this.setRotateAngle(pelvicfinL, -0.4363F, -0.7854F, 0.5236F);
        this.pelvicfinL.cubeList.add(new ModelBox(pelvicfinL, 34, 84, 2.0F, -0.5F, -1.0F, 7, 2, 1, 0.0F, false));

        this.pelvicfinL2 = new AdvancedModelRenderer(this);
        this.pelvicfinL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pelvicfinL.addChild(pelvicfinL2);
        this.pelvicfinL2.cubeList.add(new ModelBox(pelvicfinL2, 32, 35, 5.75F, -1.0F, -0.5F, 4, 3, 0, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 15.5F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -4.5F, -4.5F, 0.5F, 9, 11, 7, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 95, 1, -4.5F, -4.5F, -0.5F, 9, 11, 1, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 62, 0, -4.0F, -4.499F, 0.5F, 8, 11, 7, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 101, 15, -4.0F, -4.499F, -0.5F, 8, 11, 1, 0.0F, false));

        this.dorsalfin = new AdvancedModelRenderer(this);
        this.dorsalfin.setRotationPoint(0.0F, -3.0F, 6.0F);
        this.body3.addChild(dorsalfin);
        this.setRotateAngle(dorsalfin, -0.0873F, 0.0F, 0.0F);
        this.dorsalfin.cubeList.add(new ModelBox(dorsalfin, 27, 0, -0.5F, -3.0F, -1.5F, 1, 3, 3, 0.0F, false));
        this.dorsalfin.cubeList.add(new ModelBox(dorsalfin, 0, 16, 0.0F, -3.75F, -1.0F, 0, 2, 2, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 7.25F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 19, 18, -3.5F, -4.0F, 0.25F, 7, 10, 3, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 62, 19, -3.5F, -4.0F, -0.75F, 7, 10, 1, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 3.25F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 46, 86, -2.5F, -4.001F, 0.0F, 5, 10, 4, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 65, 100, -2.5F, -4.001F, -1.0F, 5, 10, 1, 0.0F, false));

        this.fin = new AdvancedModelRenderer(this);
        this.fin.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.body5.addChild(fin);
        this.fin.cubeList.add(new ModelBox(fin, 86, 85, -1.01F, -2.0F, 0.75F, 2, 6, 8, 0.0F, false));
        this.fin.cubeList.add(new ModelBox(fin, 0, 18, -1.02F, -0.25F, 8.25F, 2, 2, 5, 0.0F, false));

        this.finbase1_r1 = new AdvancedModelRenderer(this);
        this.finbase1_r1.setRotationPoint(0.0F, 6.0F, -62.0F);
        this.fin.addChild(finbase1_r1);
        this.setRotateAngle(finbase1_r1, 0.1309F, 0.0F, 0.0F);
        this.finbase1_r1.cubeList.add(new ModelBox(finbase1_r1, 22, 88, -1.5F, -2.0F, 60.75F, 3, 7, 6, 0.0F, false));

        this.finbase3_r1 = new AdvancedModelRenderer(this);
        this.finbase3_r1.setRotationPoint(0.0F, 6.0F, -62.0F);
        this.fin.addChild(finbase3_r1);
        this.setRotateAngle(finbase3_r1, -0.4363F, 0.0F, 0.0F);
        this.finbase3_r1.cubeList.add(new ModelBox(finbase3_r1, 2, 23, 0.0F, -38.15F, 54.25F, 0, 2, 14, 0.0F, false));
        this.finbase3_r1.cubeList.add(new ModelBox(finbase3_r1, 68, 80, -1.0F, -37.25F, 54.75F, 2, 3, 10, 0.0F, false));

        this.finbase4_r1 = new AdvancedModelRenderer(this);
        this.finbase4_r1.setRotationPoint(0.0F, 4.0F, -62.0F);
        this.fin.addChild(finbase4_r1);
        this.setRotateAngle(finbase4_r1, 0.4363F, 0.0F, 0.0F);
        this.finbase4_r1.cubeList.add(new ModelBox(finbase4_r1, 1, 56, -0.01F, 28.75F, 57.5F, 0, 2, 14, 0.0F, false));
        this.finbase4_r1.cubeList.add(new ModelBox(finbase4_r1, 1, 73, -0.99F, 27.0F, 58.25F, 2, 3, 11, 0.0F, false));

        this.finbase2_r1 = new AdvancedModelRenderer(this);
        this.finbase2_r1.setRotationPoint(0.0F, 4.0F, -62.0F);
        this.fin.addChild(finbase2_r1);
        this.setRotateAngle(finbase2_r1, -0.1309F, 0.0F, 0.0F);
        this.finbase2_r1.cubeList.add(new ModelBox(finbase2_r1, 110, 81, -1.49F, -12.0F, 59.75F, 3, 6, 6, 0.0F, false));

        this.dorsalfin2 = new AdvancedModelRenderer(this);
        this.dorsalfin2.setRotationPoint(0.0F, -3.0F, 1.75F);
        this.body4.addChild(dorsalfin2);
        this.setRotateAngle(dorsalfin2, -0.1745F, 0.0F, 0.0F);
        this.dorsalfin2.cubeList.add(new ModelBox(dorsalfin2, 34, 4, -0.5F, -3.0F, -0.5F, 1, 3, 2, 0.0F, false));
        this.dorsalfin2.cubeList.add(new ModelBox(dorsalfin2, 32, 29, 0.0F, -4.75F, -0.5F, 0, 3, 3, 0.0F, false));

        this.analfin = new AdvancedModelRenderer(this);
        this.analfin.setRotationPoint(0.0F, 4.0F, -0.25F);
        this.body4.addChild(analfin);
        this.setRotateAngle(analfin, 0.7854F, 0.0F, 0.0F);
        this.analfin.cubeList.add(new ModelBox(analfin, 0, 56, -0.5F, -0.75F, -1.5F, 1, 6, 3, 0.0F, false));
        this.analfin.cubeList.add(new ModelBox(analfin, 0, 0, 0.0F, 2.25F, -1.25F, 0, 4, 3, 0.0F, false));

        this.pectoralfinL = new AdvancedModelRenderer(this);
        this.pectoralfinL.setRotationPoint(4.0F, -1.0F, 10.0F);
        this.bodybase.addChild(pectoralfinL);
        this.setRotateAngle(pectoralfinL, -0.4363F, -0.7854F, 0.5236F);
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 0, 51, 0.0F, -1.0F, -1.0F, 5, 3, 2, 0.0F, false));

        this.pectoralfinL2 = new AdvancedModelRenderer(this);
        this.pectoralfinL2.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.pectoralfinL.addChild(pectoralfinL2);
        this.pectoralfinL2.cubeList.add(new ModelBox(pectoralfinL2, 82, 78, 0.0F, -2.25F, 0.0F, 10, 5, 0, 0.0F, false));
        this.pectoralfinL2.cubeList.add(new ModelBox(pectoralfinL2, 84, 56, 0.0F, -1.5F, -0.5F, 8, 4, 1, 0.0F, false));

        this.pectoralfinR = new AdvancedModelRenderer(this);
        this.pectoralfinR.setRotationPoint(-4.0F, -1.0F, 10.0F);
        this.bodybase.addChild(pectoralfinR);
        this.setRotateAngle(pectoralfinR, -0.4363F, 0.7854F, -0.5236F);
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 0, 25, -5.0F, -1.0F, -1.0F, 5, 3, 2, 0.0F, false));

        this.pectoralfinR2 = new AdvancedModelRenderer(this);
        this.pectoralfinR2.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.pectoralfinR.addChild(pectoralfinR2);
        this.pectoralfinR2.cubeList.add(new ModelBox(pectoralfinR2, 62, 35, -10.0F, -2.25F, 0.0F, 10, 5, 0, 0.0F, false));
        this.pectoralfinR2.cubeList.add(new ModelBox(pectoralfinR2, 84, 51, -8.0F, -1.5F, -0.5F, 8, 4, 1, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.bodybase.render(f5);
    }

    public void renderStaticWall(float f) {
        this.bodybase.rotateAngleY = (float) Math.toRadians(90);
        this.bodybase.offsetY = -0.2F;
        this.bodybase.offsetX = -0.3F;
        this.bodybase.offsetZ = -0.05F;
        this.bodybase.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(body1, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(body3, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(body4, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(body5, 0.0F, -0.3F, 0.0F);
        this.bodybase.offsetY = -0.5F;
        this.bodybase.render(0.01F);
        resetToDefaultPose();


    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(bodybase, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(body1, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(body2, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(body3, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(body4, 0.0F, -0.4F, 0.0F);
        this.setRotateAngle(body5, 0.0F, -0.5F, 0.0F);
        this.bodybase.offsetY = 0.1F;
        this.bodybase.render(0.01F);
        resetToDefaultPose();
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

        this.bodybase.offsetY = -0.1F;
        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5, this.fin};
        ((EntityPrehistoricFloraRhizodus)e).tailBuffer.applyChainSwingBuffer(fishTail);

        float speed = 0.125F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 3F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.22F;
        }
        if (!e.isInWater()) {
            speed = 0.20F;
        }

        //this.head.rotateAngleY += ((f3 / 2F) / (180F / (float) Math.PI));
        //this.head.rotateAngleX += ((f4 / 2F) / (180F / (float) Math.PI));
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.35F * still, -0.65, f2, 0.6F * still);
            this.swing(bodybase, speed, 0.1F * still, true, 0, 0, f2, 0.65F);
        }
        else {
            this.swing(bodybase, speed, 0.06F, true, 0, 0, f2, 0.5F);
        }
        this.flap(pectoralfinL, (float) (speed * 0.65), 0.8F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinL, (float) (speed * 0.65), 0.6F, true, 0, 0, f2, 0.5F);
        this.swing(pectoralfinL2, (float) (speed * 0.65), 0.4F, false, 0.5F, 0, f2, 0.5F);
        this.flap(pectoralfinR, (float) (speed * 0.65), -0.8F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinR, (float) (speed * 0.65), -0.6F, true, 0, 0, f2, 0.5F);
        this.swing(pectoralfinR2, (float) (speed * 0.65), -0.4F, false, 0.5F, 0, f2, 0.5F);

        this.flap(pelvicfinL, (float) (speed * 0.65), 0.8F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinL, (float) (speed * 0.65), 0.6F, true, 1, 0, f2, 0.5F);
        //this.swing(pelvicfinL2, (float) (speed * 0.65), 0.4F, true, 1.5F, 0, f2, 0.35F);
        this.flap(pelvicfinR, (float) (speed * 0.65), -0.8F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinR, (float) (speed * 0.65), -0.6F, true, 1, 0, f2, 0.5F);
        //this.swing(pelvicfinR2, (float) (speed * 0.65), -0.4F, true, 1.5F, 0, f2, 0.35F);

        if (!e.isInWater()) {
            this.bodybase.rotateAngleZ = (float) Math.toRadians(90);
            this.bodybase.offsetY = -0.15F;
            this.bob(bodybase, -speed * 1.8F, 1.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.5F, 0.02F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.2F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(4);
        animator.move(this.head, 0,0,-0.5F);
        animator.rotate(this.head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

    }
}

