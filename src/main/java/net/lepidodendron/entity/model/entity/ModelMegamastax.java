package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMegamastax extends AdvancedModelBase {
    private final AdvancedModelRenderer Root;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer forehead;
    private final AdvancedModelRenderer forehead2;
    private final AdvancedModelRenderer lips;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer jaw2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer RGill;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer LGill;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer RPectoral;
    private final AdvancedModelRenderer LPectoral;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer RPelvic;
    private final AdvancedModelRenderer LPelvic;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;

    private ModelAnimator animator;

    public ModelMegamastax() {
        this.textureWidth = 64;
        this.textureHeight = 58;

        this.Root = new AdvancedModelRenderer(this);
        this.Root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -3.5F, -6.0F);
        this.Root.addChild(Body);
        this.Body.cubeList.add(new ModelBox(Body, 33, 31, -1.5F, -2.5F, -2.0F, 3, 5, 5, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 3.0F, 3.0F);
        this.Body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.096F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 34, 14, -1.0F, -1.0F, -5.0F, 3, 1, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -3.0F, 3.0F);
        this.Body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.096F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 27, 42, -1.0F, 0.0F, -5.0F, 3, 1, 5, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.15F, -1.65F);
        this.Body.addChild(Head);
        this.setRotateAngle(Head, 0.0873F, 0.0F, 0.0F);


        this.forehead = new AdvancedModelRenderer(this);
        this.forehead.setRotationPoint(-0.5F, -2.25F, 0.1F);
        this.Head.addChild(forehead);
        this.setRotateAngle(forehead, 0.1309F, 0.0F, 0.0F);
        this.forehead.cubeList.add(new ModelBox(forehead, 45, 42, -1.0F, 0.0F, -4.0F, 3, 2, 4, 0.0F, false));
        this.forehead.cubeList.add(new ModelBox(forehead, 50, 49, -1.0F, 0.5F, -4.0F, 3, 1, 2, 0.01F, false));

        this.forehead2 = new AdvancedModelRenderer(this);
        this.forehead2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.forehead.addChild(forehead2);
        this.setRotateAngle(forehead2, 0.1309F, 0.0F, 0.0F);
        this.forehead2.cubeList.add(new ModelBox(forehead2, 0, 15, -0.5F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.lips = new AdvancedModelRenderer(this);
        this.lips.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.forehead2.addChild(lips);
        this.setRotateAngle(lips, -0.5236F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.0F, 0.7F);
        this.lips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.023F, -0.173F, 0.1329F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 40, 6, 0.0F, -0.8F, 0.0F, 0, 1, 5, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, 1.0F, 0.7F);
        this.lips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.023F, 0.173F, -0.1329F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 40, 6, 0.0F, -0.8F, 0.0F, 0, 1, 5, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0524F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 52, 7, -1.0F, -0.96F, 5.0F, 3, 1, 2, -0.01F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 10, 15, -1.0F, 0.0F, 2.45F, 3, 1, 4, -0.01F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 19, 0, -0.5F, -0.01F, 0.0F, 2, 1, 3, -0.01F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 0.75F, 0.1F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.2618F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 40, 0, -1.5F, -0.7F, -1.0F, 3, 1, 2, -0.02F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, 1.5F, -3.5F);
        this.Jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1012F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 15, 47, -1.0F, -1.0F, 0.0F, 3, 1, 4, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 0.5F, -3.5F);
        this.Jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1309F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 50, 34, -1.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F, false));

        this.jaw2 = new AdvancedModelRenderer(this);
        this.jaw2.setRotationPoint(-0.5F, 1.5F, -3.5F);
        this.Jaw.addChild(jaw2);
        this.setRotateAngle(jaw2, -0.1309F, 0.0F, 0.0F);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 0, 19, -0.5F, -1.0F, -1.98F, 2, 1, 2, -0.02F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, -1.7F, -2.7F);
        this.jaw2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0324F, 0.1341F, 0.0822F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, 0.125F, 0.35F, 0.25F, 0, 1, 3, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.7F, -2.7F);
        this.jaw2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0324F, -0.1341F, -0.0822F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -0.125F, 0.35F, 0.25F, 0, 1, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.jaw2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1745F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 5, -0.5F, -1.0F, -0.93F, 2, 1, 1, -0.03F, false));

        this.RGill = new AdvancedModelRenderer(this);
        this.RGill.setRotationPoint(-1.5F, 0.5F, -1.75F);
        this.Body.addChild(RGill);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RGill.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.2182F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 17, 36, 0.0F, -3.0F, 0.0F, 2, 5, 5, 0.0F, false));

        this.LGill = new AdvancedModelRenderer(this);
        this.LGill.setRotationPoint(1.5F, 0.5F, -1.75F);
        this.Body.addChild(LGill);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LGill.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.2182F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 17, 36, -2.0F, -3.0F, 0.0F, 2, 5, 5, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 2.8F);
        this.Body.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 0, -2.5F, -3.0F, 0.0F, 5, 6, 8, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, -3.0F, 2.0F);
        this.Body2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.3054F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 39, 44, 0.5F, -6.0F, 0.0F, 0, 6, 5, 0.0F, false));

        this.RPectoral = new AdvancedModelRenderer(this);
        this.RPectoral.setRotationPoint(-2.0F, 2.0F, 1.0F);
        this.Body2.addChild(RPectoral);
        this.setRotateAngle(RPectoral, -0.0377F, 0.2972F, -0.6872F);
        this.RPectoral.cubeList.add(new ModelBox(RPectoral, 0, 53, -3.0F, -0.5F, -1.0F, 3, 1, 2, 0.0F, false));
        this.RPectoral.cubeList.add(new ModelBox(RPectoral, 27, 9, -7.0F, 0.0F, -1.0F, 7, 0, 4, 0.0F, false));

        this.LPectoral = new AdvancedModelRenderer(this);
        this.LPectoral.setRotationPoint(2.0F, 2.0F, 1.0F);
        this.Body2.addChild(LPectoral);
        this.setRotateAngle(LPectoral, -0.0377F, -0.2972F, 0.6872F);
        this.LPectoral.cubeList.add(new ModelBox(LPectoral, 0, 53, 0.0F, -0.5F, -1.0F, 3, 1, 2, 0.0F, true));
        this.LPectoral.cubeList.add(new ModelBox(LPectoral, 27, 9, 0.0F, 0.0F, -1.0F, 7, 0, 4, 0.0F, true));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 7.8F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 19, 15, -2.0F, -2.5F, 0.0F, 4, 5, 6, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -3.0F, 0.0F);
        this.Body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0698F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 27, 0, -1.0F, 0.0F, 0.0F, 3, 2, 6, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 3.0F, 0.0F);
        this.Body3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0785F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 19, 27, -1.0F, -2.0F, 0.0F, 3, 2, 6, 0.0F, false));

        this.RPelvic = new AdvancedModelRenderer(this);
        this.RPelvic.setRotationPoint(-2.0F, 2.5F, 2.0F);
        this.Body3.addChild(RPelvic);
        this.setRotateAngle(RPelvic, -0.0043F, 0.6699F, -0.798F);
        this.RPelvic.cubeList.add(new ModelBox(RPelvic, 45, 21, -5.0F, 0.0F, 0.0F, 5, 0, 3, 0.0F, false));

        this.LPelvic = new AdvancedModelRenderer(this);
        this.LPelvic.setRotationPoint(2.0F, 2.5F, 2.0F);
        this.Body3.addChild(LPelvic);
        this.setRotateAngle(LPelvic, -0.0043F, -0.6699F, 0.798F);
        this.LPelvic.cubeList.add(new ModelBox(LPelvic, 45, 21, 0.0F, 0.0F, 0.0F, 5, 0, 3, 0.0F, true));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 0.0F, 5.7F);
        this.Body3.addChild(Tail);
        this.Tail.cubeList.add(new ModelBox(Tail, 0, 35, -1.5F, -2.0F, 0.0F, 3, 4, 5, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, 2.5F, 0.0F);
        this.Tail.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.3054F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 46, 9, 0.5F, -0.5F, 1.25F, 0, 4, 5, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, -2.5F, 0.0F);
        this.Tail.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.3927F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 26, 49, 1.0F, -5.0F, 0.5F, 0, 5, 4, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, 2.5F, 0.0F);
        this.Tail.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.096F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 46, 0, -0.5F, -1.0F, 0.0F, 2, 1, 5, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, -2.5F, 0.0F);
        this.Tail.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1047F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 45, -0.5F, 0.0F, 0.0F, 2, 2, 5, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Tail.addChild(Tail2);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 34, 21, -1.0F, -1.5F, -1.0F, 2, 3, 6, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 4.7F);
        this.Tail2.addChild(Tail3);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 46, 26, -0.5F, -1.0F, 0.0F, 1, 2, 5, 0.0F, false));
        this.Tail3.cubeList.add(new ModelBox(Tail3, 12, 35, -0.5F, -0.5F, 5.0F, 1, 1, 2, 0.0F, false));
        this.Tail3.cubeList.add(new ModelBox(Tail3, 0, 15, 0.0F, -5.5F, 0.0F, 0, 11, 9, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Root.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Root.offsetY = -0.195F;
        this.Root.offsetX = -0.066F;
        this.Root.offsetZ = -0.015F;
        this.Root.rotateAngleY = (float) Math.toRadians(90);
        this.Root.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Body, 0.0873F, -0.1309F, 0.0F);
        this.setRotateAngle(Body2, 0.0436F, -0.0436F, 0.0F);
        this.setRotateAngle(Body3, 0.0873F, -0.0873F, 0.0F);
        this.setRotateAngle(cube_r1, -0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, 0.0F, -0.2182F, 0.0F);
        this.setRotateAngle(cube_r12, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(cube_r13, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, -0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, 0.0785F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r17, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r18, 0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, -0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -0.023F, -0.173F, 0.1329F);
        this.setRotateAngle(cube_r4, -0.023F, 0.173F, -0.1329F);
        this.setRotateAngle(cube_r5, 0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, -0.1012F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.0324F, 0.1341F, 0.0822F);
        this.setRotateAngle(cube_r9, -0.0324F, -0.1341F, -0.0822F);
        this.setRotateAngle(forehead, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(forehead2, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(jaw2, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(lips, -0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(LPectoral, -0.0377F, -0.2972F, 0.6872F);
        this.setRotateAngle(LPelvic, -0.0043F, -0.6699F, 0.798F);
        this.setRotateAngle(RPectoral, -0.0377F, 0.2972F, -0.6872F);
        this.setRotateAngle(RPelvic, -0.0043F, 0.6699F, -0.798F);
        this.setRotateAngle(Tail, 0.0436F, -0.1309F, 0.0F);
        this.setRotateAngle(Tail2, 0.0436F, -0.1745F, 0.0F);
        this.setRotateAngle(Tail3, 0.0436F, -0.1745F, 0.0F);
        this.Root.offsetY = -0.42F;
        this.Root.render(0.01F);
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


        AdvancedModelRenderer[] fishTail = {this.Tail, this.Tail2, this.Tail3};

        float speed = 0.33F;
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
            this.swing(Body, speed*still, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(Body, speed*still, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(LPectoral, (float) (speed * 0.65), 0.58F, false, 0.8F, 0, f2, 0.5F);
        this.swing(LPectoral, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(RPectoral, (float) (speed * 0.65), -0.58F, false, 0.8F, 0, f2, 0.5F);
        this.swing(RPectoral, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(LPelvic, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(LPelvic, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(RPelvic, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(RPelvic, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.Body.rotateAngleZ = (float) Math.toRadians(90);
            this.Body.offsetY = 0.1F;
            this.bob(Body, -speed * 3.2F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 2.7F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 2.7F, 0.15F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        //animator.move(this.Cephalon, 0,0,-0.5F);
       // animator.rotate(this.Cephalon, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
       // animator.rotate(this.maxillae, -(float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

