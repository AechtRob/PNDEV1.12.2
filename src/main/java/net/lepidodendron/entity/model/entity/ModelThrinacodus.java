package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraFishBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelThrinacodus extends AdvancedModelBase {
    private final AdvancedModelRenderer Thrinacodus;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer LPectoral;
    private final AdvancedModelRenderer RPectoral;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer LPelvic;
    private final AdvancedModelRenderer RPelvic;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;

    private ModelAnimator animator;

    public ModelThrinacodus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Thrinacodus = new AdvancedModelRenderer(this);
        this.Thrinacodus.setRotationPoint(0.0F, 21.0F, 16.0F);
        this.Thrinacodus.cubeList.add(new ModelBox(Thrinacodus, 0, 55, -1.0F, -1.0F, -6.0F, 2, 3, 12, 0.02F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 0.0F, -5.7F);
        this.Thrinacodus.addChild(Body);
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -1.0F, -1.0F, -10.0F, 2, 3, 10, -0.01F, false));

        this.LPectoral = new AdvancedModelRenderer(this);
        this.LPectoral.setRotationPoint(1.0F, 1.0F, -5.0F);
        this.Body.addChild(LPectoral);
        this.setRotateAngle(LPectoral, 0.0F, -0.5672F, 0.3927F);
        this.LPectoral.cubeList.add(new ModelBox(LPectoral, 63, 66, 0.0F, 0.0F, 0.0F, 7, 0, 4, 0.0F, false));

        this.RPectoral = new AdvancedModelRenderer(this);
        this.RPectoral.setRotationPoint(-1.0F, 1.0F, -5.0F);
        this.Body.addChild(RPectoral);
        this.setRotateAngle(RPectoral, 0.0F, 0.5672F, -0.3927F);
        this.RPectoral.cubeList.add(new ModelBox(RPectoral, 63, 66, -7.0F, 0.0F, 0.0F, 7, 0, 4, 0.0F, true));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.Body.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 25, 27, -0.5F, 0.0F, -8.99F, 1, 1, 8, 0.01F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 0, -1.0F, -1.0F, -1.0F, 2, 2, 2, 0.01F, false));
        this.Head.cubeList.add(new ModelBox(Head, 11, 14, -1.0F, -0.5F, -4.5F, 2, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, 0.0F, -1.0F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0628F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 28, 0, -1.0F, 0.0F, -8.0F, 1, 1, 8, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, -1.0F, -1.0F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1239F, 0.0628F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 14, -1.0F, 0.0F, -8.0F, 1, 1, 8, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, -1.0F, -1.0F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1239F, -0.0628F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 27, 0.0F, 0.0F, -8.0F, 1, 1, 8, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, 0.0F, -1.0F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.0628F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 37, 0.0F, 0.0F, -8.0F, 1, 1, 8, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.0436F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 5, -1.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 28, 10, -0.5F, 0.0F, -7.0F, 1, 1, 6, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 1.0F, -7.0F);
        this.Jaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2618F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 14, -0.5F, -1.0F, -2.0F, 1, 1, 2, -0.01F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 5.9F);
        this.Thrinacodus.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 50, 49, -1.0F, -1.0F, 0.0F, 2, 3, 13, 0.03F, false));

        this.LPelvic = new AdvancedModelRenderer(this);
        this.LPelvic.setRotationPoint(1.0F, 2.0F, 10.0F);
        this.Body2.addChild(LPelvic);
        this.setRotateAngle(LPelvic, 0.0F, -0.7418F, 0.48F);
        this.LPelvic.cubeList.add(new ModelBox(LPelvic, 25, 37, 0.0F, 0.0F, 0.0F, 5, 0, 3, 0.0F, false));

        this.RPelvic = new AdvancedModelRenderer(this);
        this.RPelvic.setRotationPoint(-1.0F, 2.0F, 10.0F);
        this.Body2.addChild(RPelvic);
        this.setRotateAngle(RPelvic, 0.0F, 0.7418F, -0.48F);
        this.RPelvic.cubeList.add(new ModelBox(RPelvic, 25, 37, -5.0F, 0.0F, 0.0F, 5, 0, 3, 0.0F, true));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 0.0F, 13.0F);
        this.Body2.addChild(Tail1);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 48, 0, -1.0F, -1.0F, 0.0F, 2, 3, 15, 0.01F, false));
        this.Tail1.cubeList.add(new ModelBox(Tail1, 16, 58, 0.0F, 2.0F, 2.0F, 0, 3, 13, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 13.8F);
        this.Tail1.addChild(Tail2);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 47, 23, -0.5F, -1.0F, 0.0F, 1, 3, 18, 0.0F, false));
        this.Tail2.cubeList.add(new ModelBox(Tail2, 32, 49, 0.0F, 2.0F, 1.0F, 0, 3, 17, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 18.0F);
        this.Tail2.addChild(Tail3);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 28, 0, 0.0F, 1.0F, 0.0F, 0, 3, 19, 0.0F, false));
        this.Tail3.cubeList.add(new ModelBox(Tail3, 25, 27, -0.5F, -1.0F, 0.0F, 1, 2, 19, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.0F, 18.0F);
        this.Tail3.addChild(Tail4);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 0, 0, -0.5F, -0.5F, 1.0F, 1, 1, 25, -0.01F, false));
        this.Tail4.cubeList.add(new ModelBox(Tail4, 0, 27, 0.0F, 0.0F, 1.0F, 0, 3, 24, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Thrinacodus.render(f5 * 0.12F);
    }
    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.Thrinacodus.rotateAngleY = (float) Math.toRadians(90);
        this.Jaw.rotateAngleX = (float) Math.toRadians(20);
        this.Thrinacodus.rotateAngleY = (float) Math.toRadians(50);
        this.Body.rotateAngleY = (float) Math.toRadians(15);
        this.Body2.rotateAngleY = (float) Math.toRadians(10);
        this.Tail1.rotateAngleY = (float) Math.toRadians(10);
        this.Tail2.rotateAngleY = (float) Math.toRadians(18);
        this.Tail3.rotateAngleY = (float) Math.toRadians(20);
        this.Tail4.rotateAngleY = (float) Math.toRadians(20);
        this.Thrinacodus.offsetX = -0.3F;
        this.Thrinacodus.offsetY = -0.2F;
        this.Thrinacodus.offsetZ = -0.07F;
        this.Thrinacodus.render(0.01F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
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

        this.Thrinacodus.offsetY = 1.2F;

        AdvancedModelRenderer[] fishTail = {this.Body2, this.Tail1, this.Tail2, this.Tail3, this.Tail4};

        float speed = 0.18F;
        EntityPrehistoricFloraFishBase ee = (EntityPrehistoricFloraFishBase) e;
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.66F;
        }
        if (!e.isInWater()) {
            speed = 0.3F;
        }

        //this.tohead.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.tohead.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            //this.chainWave(fishTail, speed * still, 0.03F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.3F, 0.5F, -3, f2, 0.5F);
/*
            this.swing(Body2, (float) (speed * 0.55), (float)Math.toRadians(17.5), true, 0, 0, f2, 0.75F);
            this.swing(Tail1, (float) (speed * 0.6), (float)Math.toRadians(17.5), true, 0, 0, f2, 0.75F);
            this.swing(Tail2, (float) (speed * 0.65), (float)Math.toRadians(17.5), true, 0, 0, f2, 0.75F);
            this.swing(Tail3, (float) (speed * 0.7), (float)Math.toRadians(15), true, 0, 0, f2, 0.75F);
            this.swing(Tail4, (float) (speed * 0.75), (float)Math.toRadians(12.5), true, 0, 0, f2, 0.75F);
            */


            this.swing(Thrinacodus, speed, 0.25F * still, true, 2, 0, f2, 0.5F);
        }
        else {
            this.swing(Thrinacodus, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(LPectoral, (float) (speed * 0.65), 0.4F, false, 0.8F, 0, f2, 0.75F);
        this.swing(LPectoral, (float) (speed * 0.65), 0.3F, true, 0, 0, f2, 0.75F);
        this.flap(RPectoral, (float) (speed * 0.65), -0.4F, false, 0.8F, 0, f2, 0.75F);
        this.swing(RPectoral, (float) (speed * 0.65), -0.3F, true, 0, 0, f2, 0.75F);

        this.flap(LPelvic, (float) (speed * 0.65), 0.4F, false, 1.8F, 0, f2, 0.75F);
        this.swing(LPelvic, (float) (speed * 0.65), 0.3F, true, 1, 0, f2, 0.75F);
        this.flap(RPelvic, (float) (speed * 0.65), -0.4F, false, 1.8F, 0, f2, 0.75F);
        this.swing(RPelvic, (float) (speed * 0.65), -0.3F, true, 1, 0, f2, 0.75F);

        if (!e.isInWater()) {
            this.Thrinacodus.rotateAngleZ = (float) Math.toRadians(90);
            this.Thrinacodus.offsetY = 1.33F;
            this.bob(Thrinacodus, -speed * 1.8F, 0.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.5F, 0.05F, 0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.05F, -0.55, f2, 0.4F * still);

        }

    }
}

