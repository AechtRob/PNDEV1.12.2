package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraParmastega;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelParmastega extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended Parmastega;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended Neck;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended Head;
    private final AdvancedModelRendererExtended Upperjaw;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended Snout;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended Jaw;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended LArm;
    private final AdvancedModelRendererExtended LArm2;
    private final AdvancedModelRendererExtended RArm;
    private final AdvancedModelRendererExtended RArm2;
    private final AdvancedModelRendererExtended Body;
    private final AdvancedModelRendererExtended Body2;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended LLeg;
    private final AdvancedModelRendererExtended LLeg2;
    private final AdvancedModelRendererExtended RLeg;
    private final AdvancedModelRendererExtended RLeg2;
    private final AdvancedModelRendererExtended Tail;
    private final AdvancedModelRendererExtended Tail2;
    private final AdvancedModelRendererExtended Tail3;
    private final AdvancedModelRendererExtended Tail4;

    private ModelAnimator animator;

    public ModelParmastega() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Parmastega = new AdvancedModelRendererExtended(this);
        this.Parmastega.setRotationPoint(0.0F, 21.0F, -7.0F);
        this.setRotateAngle(Parmastega, 0.0436F, 0.0F, 0.0F);
        this.Parmastega.cubeList.add(new ModelBox(Parmastega, 28, 0, -3.5F, -2.0F, -2.5F, 7, 4, 5, 0.02F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Parmastega.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1396F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 67, -3.0F, 1.4F, -2.0F, 6, 1, 5, 0.0F, false));

        this.Neck = new AdvancedModelRendererExtended(this);
        this.Neck.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Parmastega.addChild(Neck);
        this.setRotateAngle(Neck, -0.0436F, 0.0F, 0.0F);
        this.Neck.cubeList.add(new ModelBox(Neck, 46, 45, -3.0F, -2.0F, -3.0F, 6, 3, 3, 0.01F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Neck.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 47, 0, -2.5F, 1.0F, -4.0F, 5, 1, 3, 0.01F, false));

        this.Head = new AdvancedModelRendererExtended(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Neck.addChild(Head);


        this.Upperjaw = new AdvancedModelRendererExtended(this);
        this.Upperjaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addChild(Upperjaw);
        this.Upperjaw.cubeList.add(new ModelBox(Upperjaw, 0, 17, 1.01F, -2.8F, -4.01F, 1, 1, 2, 0.0F, false));
        this.Upperjaw.cubeList.add(new ModelBox(Upperjaw, 0, 17, -2.01F, -2.8F, -4.01F, 1, 1, 2, 0.0F, true));
        this.Upperjaw.cubeList.add(new ModelBox(Upperjaw, 44, 21, -2.0F, -2.0F, -4.0F, 4, 1, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, -2.0F, -4.0F);
        this.Upperjaw.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2356F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 20, -1.0F, 0.0F, -3.0F, 2, 1, 1, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 44, 51, -1.5F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.Snout = new AdvancedModelRendererExtended(this);
        this.Snout.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Upperjaw.addChild(Snout);
        this.setRotateAngle(Snout, -0.0436F, 0.0F, 0.0F);
        this.Snout.cubeList.add(new ModelBox(Snout, 50, 36, -1.0F, -1.0F, -8.0F, 2, 1, 3, 0.0F, false));
        this.Snout.cubeList.add(new ModelBox(Snout, 0, 53, -1.5F, -1.0F, -5.0F, 3, 1, 2, 0.0F, false));
        this.Snout.cubeList.add(new ModelBox(Snout, 9, 50, -2.5F, -1.0F, -3.0F, 5, 1, 3, 0.0F, false));
        this.Snout.cubeList.add(new ModelBox(Snout, 28, 9, -2.5F, -0.1F, -1.2F, 5, 1, 1, 0.02F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(-1.0F, 0.0F, -8.0F);
        this.Snout.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.2967F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 36, 0.0F, -0.99F, 0.0F, 1, 1, 8, 0.0F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(1.0F, 0.0F, -8.0F);
        this.Snout.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.2967F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 40, 36, -1.0F, -0.99F, 0.0F, 1, 1, 8, 0.0F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(-1.0F, 1.0F, -7.95F);
        this.Snout.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.2967F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, 0.9F, -1.6F, 0.45F, 0, 1, 6, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 19, 12, 0.05F, -1.6F, 0.0F, 0, 1, 7, 0.0F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(1.0F, 1.0F, -7.95F);
        this.Snout.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.2967F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 1, -0.9F, -1.6F, 0.45F, 0, 1, 6, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 19, 13, -0.05F, -1.6F, 0.0F, 0, 1, 7, 0.0F, false));

        this.Jaw = new AdvancedModelRendererExtended(this);
        this.Jaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.0436F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 50, 30, -1.0F, -0.01F, -7.95F, 2, 1, 3, -0.01F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 52, 52, -1.5F, -0.01F, -4.97F, 3, 1, 2, -0.01F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 49, 6, -2.5F, -0.01F, -2.99F, 5, 1, 3, -0.01F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(-1.0F, 1.0F, -7.95F);
        this.Jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.2967F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 19, 11, 0.05F, -1.3F, 0.0F, 0, 1, 7, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 34, 18, 0.0F, -1.02F, 0.0F, 1, 1, 8, -0.01F, false));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(1.0F, 1.0F, -7.95F);
        this.Jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.2967F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 24, 25, -0.05F, -1.3F, 0.0F, 0, 1, 7, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 40, 27, -1.0F, -1.02F, 0.0F, 1, 1, 8, -0.01F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(0.0F, 1.0F, -7.95F);
        this.Jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0611F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 50, 26, -1.0F, -1.01F, 0.0F, 2, 1, 3, -0.01F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 39, 45, -1.5F, -1.01F, 2.98F, 3, 1, 2, -0.01F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 24, 33, -2.0F, -1.01F, 4.96F, 4, 1, 3, -0.01F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(0.0F, 1.0F, -7.95F);
        this.Jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0611F, -0.2967F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 30, 32, -0.8563F, -1.02F, 0.2924F, 1, 1, 8, -0.01F, false));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(0.0F, 1.0F, -7.95F);
        this.Jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0611F, 0.2967F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 32, 9, -0.1437F, -1.02F, 0.2924F, 1, 1, 8, -0.01F, false));

        this.LArm = new AdvancedModelRendererExtended(this);
        this.LArm.setRotationPoint(3.0F, 0.5F, -1.5F);
        this.Parmastega.addChild(LArm);
        this.setRotateAngle(LArm, 0.3637F, -0.9964F, 0.7131F);
        this.LArm.cubeList.add(new ModelBox(LArm, 25, 50, 0.0F, -0.5F, -1.0F, 4, 1, 3, 0.0F, false));

        this.LArm2 = new AdvancedModelRendererExtended(this);
        this.LArm2.setRotationPoint(3.0F, 0.0F, 0.5F);
        this.LArm.addChild(LArm2);
        this.setRotateAngle(LArm2, 0.0F, -0.2618F, 0.0F);
        this.LArm2.cubeList.add(new ModelBox(LArm2, 0, 8, 0.0F, -0.5F, -1.0F, 4, 1, 2, -0.01F, false));
        this.LArm2.cubeList.add(new ModelBox(LArm2, 0, 0, 3.0F, 0.0F, -1.5F, 4, 0, 3, 0.0F, false));

        this.RArm = new AdvancedModelRendererExtended(this);
        this.RArm.setRotationPoint(-3.0F, 0.5F, -1.5F);
        this.Parmastega.addChild(RArm);
        this.setRotateAngle(RArm, 0.3637F, 0.9964F, -0.7131F);
        this.RArm.cubeList.add(new ModelBox(RArm, 25, 50, -4.0F, -0.5F, -1.0F, 4, 1, 3, 0.0F, true));

        this.RArm2 = new AdvancedModelRendererExtended(this);
        this.RArm2.setRotationPoint(-3.0F, 0.0F, 0.5F);
        this.RArm.addChild(RArm2);
        this.setRotateAngle(RArm2, 0.0F, 0.2618F, 0.0F);
        this.RArm2.cubeList.add(new ModelBox(RArm2, 0, 8, -4.0F, -0.5F, -1.0F, 4, 1, 2, -0.01F, true));
        this.RArm2.cubeList.add(new ModelBox(RArm2, 0, 0, -7.0F, 0.0F, -1.5F, 4, 0, 3, 0.0F, true));

        this.Body = new AdvancedModelRendererExtended(this);
        this.Body.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Parmastega.addChild(Body);
        this.setRotateAngle(Body, -0.0436F, 0.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -4.0F, -2.0F, -1.0F, 8, 5, 12, 0.03F, false));

        this.Body2 = new AdvancedModelRendererExtended(this);
        this.Body2.setRotationPoint(0.0F, 0.15F, 11.0F);
        this.Body.addChild(Body2);
        this.setRotateAngle(Body2, -0.0436F, 0.0F, 0.0F);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 17, -3.0F, -2.0F, -1.0F, 6, 4, 7, 0.02F, false));

        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.Body2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1047F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 57, -2.5F, 1.85F, 0.25F, 5, 1, 6, 0.0F, false));

        this.LLeg = new AdvancedModelRendererExtended(this);
        this.LLeg.setRotationPoint(2.5F, 1.0F, 4.0F);
        this.Body2.addChild(LLeg);
        this.setRotateAngle(LLeg, 0.3109F, -1.2259F, 0.8584F);
        this.LLeg.cubeList.add(new ModelBox(LLeg, 50, 40, 0.0F, -0.5F, -1.0F, 3, 1, 2, 0.0F, false));

        this.LLeg2 = new AdvancedModelRendererExtended(this);
        this.LLeg2.setRotationPoint(2.5F, 0.0F, 0.0F);
        this.LLeg.addChild(LLeg2);
        this.setRotateAngle(LLeg2, 0.0F, -0.2618F, 0.0F);
        this.LLeg2.cubeList.add(new ModelBox(LLeg2, 36, 50, 0.0F, -0.5F, -1.0F, 3, 1, 2, -0.01F, false));
        this.LLeg2.cubeList.add(new ModelBox(LLeg2, 0, 3, 2.0F, 0.0F, -1.5F, 4, 0, 3, 0.0F, false));

        this.RLeg = new AdvancedModelRendererExtended(this);
        this.RLeg.setRotationPoint(-2.5F, 1.0F, 4.0F);
        this.Body2.addChild(RLeg);
        this.setRotateAngle(RLeg, 0.3109F, 1.2259F, -0.8584F);
        this.RLeg.cubeList.add(new ModelBox(RLeg, 50, 40, -3.0F, -0.5F, -1.0F, 3, 1, 2, 0.0F, true));

        this.RLeg2 = new AdvancedModelRendererExtended(this);
        this.RLeg2.setRotationPoint(-2.5F, 0.0F, 0.0F);
        this.RLeg.addChild(RLeg2);
        this.setRotateAngle(RLeg2, 0.0F, 0.2618F, 0.0F);
        this.RLeg2.cubeList.add(new ModelBox(RLeg2, 36, 50, -3.0F, -0.5F, -1.0F, 3, 1, 2, -0.01F, true));
        this.RLeg2.cubeList.add(new ModelBox(RLeg2, 0, 3, -6.0F, 0.0F, -1.5F, 4, 0, 3, 0.0F, true));

        this.Tail = new AdvancedModelRendererExtended(this);
        this.Tail.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Body2.addChild(Tail);
        this.setRotateAngle(Tail, 0.0436F, 0.0F, 0.0F);
        this.Tail.cubeList.add(new ModelBox(Tail, 19, 21, -2.0F, -2.0F, 0.0F, 4, 4, 7, 0.0F, false));

        this.Tail2 = new AdvancedModelRendererExtended(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Tail.addChild(Tail2);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 12, 32, -1.5F, -2.0F, 0.0F, 3, 4, 6, -0.02F, false));
        this.Tail2.cubeList.add(new ModelBox(Tail2, 0, 39, 0.0F, -4.0F, 0.0F, 0, 8, 6, 0.0F, false));

        this.Tail3 = new AdvancedModelRendererExtended(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Tail2.addChild(Tail3);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 44, 12, -1.0F, -1.5F, -1.0F, 2, 3, 6, 0.0F, false));
        this.Tail3.cubeList.add(new ModelBox(Tail3, 18, 37, -0.01F, -4.0F, 0.0F, 0, 8, 5, 0.0F, false));

        this.Tail4 = new AdvancedModelRendererExtended(this);
        this.Tail4.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Tail3.addChild(Tail4);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 0, 19, 0.0F, -4.0F, 0.0F, 0, 8, 9, 0.0F, false));
        this.Tail4.cubeList.add(new ModelBox(Tail4, 30, 41, -0.5F, -1.0F, -1.5F, 1, 2, 7, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Parmastega.render(f5 * 0.355f);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.setRotateAngle(Parmastega, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, -0.1396F, 0.0F, 0.0F);
        this.setRotateAngle(Neck, -0.0888F, 0.2615F, -0.0117F);
        this.setRotateAngle(cube_r2, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 0.2356F, 0.0F, 0.0F);
        this.setRotateAngle(Snout, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.0F, -0.2967F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0F, 0.2967F, 0.0F);
        this.setRotateAngle(cube_r6, 0.0F, -0.2967F, 0.0F);
        this.setRotateAngle(cube_r7, 0.0F, 0.2967F, 0.0F);
        this.setRotateAngle(Jaw, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, 0.0F, -0.2967F, 0.0F);
        this.setRotateAngle(cube_r9, 0.0F, 0.2967F, 0.0F);
        this.setRotateAngle(cube_r10, -0.0611F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -0.0611F, -0.2967F, 0.0F);
        this.setRotateAngle(cube_r12, -0.0611F, 0.2967F, 0.0F);
        this.setRotateAngle(LArm, 0.3054F, -0.8727F, 0.7854F);
        this.setRotateAngle(LArm2, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(RArm, 0.3054F, 0.8727F, -0.7854F);
        this.setRotateAngle(RArm2, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(Body, -0.0438F, -0.0872F, 0.0038F);
        this.setRotateAngle(Body2, -0.0464F, -0.3487F, 0.0159F);
        this.setRotateAngle(cube_r13, 0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(LLeg, 0.1844F, -0.9715F, 0.9993F);
        this.setRotateAngle(LLeg2, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(RLeg, 0.1844F, 0.9715F, -0.9993F);
        this.setRotateAngle(RLeg2, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(Tail, 0.0457F, 0.3051F, 0.0138F);
        this.setRotateAngle(Tail2, 0.0F, 0.3491F, 0.0F);
        this.setRotateAngle(Tail3, 0.0F, 0.4363F, 0.0F);
        this.setRotateAngle(Tail4, 0.0F, 0.2182F, 0.0F);
        this.Parmastega.offsetZ = -0.7F;
        this.Parmastega.render(0.1F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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
        this.Parmastega.offsetY = 0.928F;

        EntityPrehistoricFloraParmastega Parmastega = (EntityPrehistoricFloraParmastega) e;

        this.faceTarget(f3, f4, 12, Head);

        float speed = 0.15F;

        AdvancedModelRenderer[] Tail = {this.Tail, this.Tail2, this.Tail3, this.Tail4};
        AdvancedModelRenderer[] Torso = {this.Body, this.Body2};
        Parmastega.tailBuffer.applyChainSwingBuffer(Tail);

        AdvancedModelRenderer[] LeftArm = {this.LArm, this.LArm2};
        AdvancedModelRenderer[] RightArm = {this.RArm, this.RArm2};

        AdvancedModelRenderer[] LeftLeg = {this.LLeg, this.LLeg2};
        AdvancedModelRenderer[] RightLeg = {this.RLeg, this.RLeg2};

        if (!Parmastega.isReallyInWater()) {
            if (f3 == 0.0F || !Parmastega.getIsMoving()) {
                return;
            }

            this.chainWaveExtended(LeftArm, speed * 0.4F, 0.2F,0F,0.0F, f2, 0.7F);
            this.chainWaveExtended(RightArm, speed * 0.4F, -0.2F,0F,0.0F, f2, 0.7F);

            this.chainWaveExtended(LeftLeg, speed * 0.4F, 0.2F,0F,3.0F, f2, 0.7F);
            this.chainWaveExtended(RightLeg, speed * 0.4F, -0.2F,0F,3.0F, f2, 0.7F);

            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed * 0.45F, 0.12F, -3, f2, 0.8F);
            this.chainSwing(Torso, speed, 0.1F, -3, f2, 1);
        }
        else {
            speed = speed * 2F;
            if (Parmastega.getIsFast()) {
                speed = speed * 1.33F;
            }
            this.chainSwing(Torso, speed, 0.07F, -3, f2, 1);
            if (f3 == 0.0F) {
                return;
            }

            this.chainFlapExtended(LeftArm, speed * 0.7F, 0.3F,0F,0.0F, f2, 0.7F);
            this.chainFlapExtended(RightArm, speed * 0.7F, -0.3F,0F,0.0F, f2, 0.7F);
            this.chainWaveExtended(LeftArm, speed * 0.7F, 0.2F,0F,0.0F, f2, 0.7F);
            this.chainWaveExtended(RightArm, speed * 0.7F, -0.2F,0F,0.0F, f2, 0.7F);

            this.chainFlapExtended(LeftLeg, speed * 0.7F, 0.3F,0F,3.0F, f2, 0.7F);
            this.chainFlapExtended(RightLeg, speed * 0.7F, -0.3F,0F,3.0F, f2, 0.7F);
            this.chainWaveExtended(LeftLeg, speed * 0.7F, 0.2F,0F,3.0F, f2, 0.7F);
            this.chainWaveExtended(RightLeg, speed * 0.7F, -0.2F,0F,3.0F, f2, 0.7F);

            this.chainWave(Tail, speed, 0.03F, -3, f2, 1);
            this.chainSwing(Tail, speed, 0.25F, -3, f2, 1F);

        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        //animator.move(this.neck, 0,0,-2F);
        animator.rotate(this.Head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(5);
        //animator.move(this.neck, 0,0,-2F);
        animator.rotate(this.Head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.neck, (float) Math.toRadians(0), (float) Math.toRadians(25), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(10);
    }
}
