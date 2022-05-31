package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelTetragraptus extends AdvancedModelBase {
    private final AdvancedModelRenderer full;
    private final AdvancedModelRenderer west;
    private final AdvancedModelRenderer leftw;
    private final AdvancedModelRenderer leftt_r1;
    private final AdvancedModelRenderer bonelw;
    private final AdvancedModelRenderer leftb_r1;
    private final AdvancedModelRenderer rightw;
    private final AdvancedModelRenderer rightt_r1;
    private final AdvancedModelRenderer bonerw;
    private final AdvancedModelRenderer rightb_r1;
    private final AdvancedModelRenderer east;
    private final AdvancedModelRenderer bone4;
    private final AdvancedModelRenderer lefte;
    private final AdvancedModelRenderer leftt_r2;
    private final AdvancedModelRenderer bonele;
    private final AdvancedModelRenderer leftb_r2;
    private final AdvancedModelRenderer righte;
    private final AdvancedModelRenderer rightt_r2;
    private final AdvancedModelRenderer bonere;
    private final AdvancedModelRenderer rightb_r2;

    public ModelTetragraptus() {
        this.textureWidth = 16;
        this.textureHeight = 16;

        this.full = new AdvancedModelRenderer(this);
        this.full.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.full.cubeList.add(new ModelBox(full, 0, 0, -0.5F, -15.0F, 0.0F, 1, 1, 1, 0.0F, false));
        this.full.cubeList.add(new ModelBox(full, 0, 0, 0.0F, -14.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.west = new AdvancedModelRenderer(this);
        this.west.setRotationPoint(0.0F, -12.0F, 0.5F);
        this.full.addChild(west);
        this.setRotateAngle(west, 0.0F, 3.1416F, 0.2618F);
        this.west.cubeList.add(new ModelBox(west, 0, 2, 0.0F, 0.0F, -0.5F, 0, 4, 1, 0.0F, false));

        this.leftw = new AdvancedModelRenderer(this);
        this.leftw.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.west.addChild(leftw);
        this.setRotateAngle(leftw, 0.0F, -0.6109F, 0.0F);


        this.leftt_r1 = new AdvancedModelRenderer(this);
        this.leftt_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftw.addChild(leftt_r1);
        this.setRotateAngle(leftt_r1, -0.3927F, 0.0F, 0.0F);
        this.leftt_r1.cubeList.add(new ModelBox(leftt_r1, 12, 0, -0.01F, 0.0F, -0.5F, 0, 6, 1, 0.0F, false));

        this.bonelw = new AdvancedModelRenderer(this);
        this.bonelw.setRotationPoint(0.0F, 5.25F, -2.5F);
        this.leftw.addChild(bonelw);


        this.leftb_r1 = new AdvancedModelRenderer(this);
        this.leftb_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bonelw.addChild(leftb_r1);
        this.setRotateAngle(leftb_r1, -0.1745F, 0.0F, 0.0F);
        this.leftb_r1.cubeList.add(new ModelBox(leftb_r1, 12, 9, 0.0F, 0.0F, -0.2F, 0, 6, 1, 0.0F, false));

        this.rightw = new AdvancedModelRenderer(this);
        this.rightw.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.west.addChild(rightw);
        this.setRotateAngle(rightw, 0.0F, 0.6109F, 0.0F);


        this.rightt_r1 = new AdvancedModelRenderer(this);
        this.rightt_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightw.addChild(rightt_r1);
        this.setRotateAngle(rightt_r1, 0.3927F, 0.0F, 0.0F);
        this.rightt_r1.cubeList.add(new ModelBox(rightt_r1, 14, 0, 0.01F, 0.0F, -0.5F, 0, 6, 1, 0.0F, false));

        this.bonerw = new AdvancedModelRenderer(this);
        this.bonerw.setRotationPoint(0.0F, 5.25F, 2.5F);
        this.rightw.addChild(bonerw);


        this.rightb_r1 = new AdvancedModelRenderer(this);
        this.rightb_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bonerw.addChild(rightb_r1);
        this.setRotateAngle(rightb_r1, 0.1745F, 0.0F, 0.0F);
        this.rightb_r1.cubeList.add(new ModelBox(rightb_r1, 14, 9, 0.0F, 0.05F, -0.8F, 0, 6, 1, 0.0F, false));

        this.east = new AdvancedModelRenderer(this);
        this.east.setRotationPoint(0.0F, -12.0F, 0.5F);
        this.full.addChild(east);
        this.setRotateAngle(east, 0.0F, 0.0F, -0.2618F);
        this.east.cubeList.add(new ModelBox(east, 0, 2, 0.0F, 0.0F, -0.5F, 0, 4, 1, 0.0F, false));

        this.bone4 = new AdvancedModelRenderer(this);
        this.bone4.setRotationPoint(0.0F, 14.0F, -0.5F);
        this.east.addChild(bone4);


        this.lefte = new AdvancedModelRenderer(this);
        this.lefte.setRotationPoint(0.0F, -10.5F, 0.5F);
        this.bone4.addChild(lefte);
        this.setRotateAngle(lefte, 0.0F, -0.6109F, 0.0F);


        this.leftt_r2 = new AdvancedModelRenderer(this);
        this.leftt_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lefte.addChild(leftt_r2);
        this.setRotateAngle(leftt_r2, -0.3927F, 0.0F, 0.0F);
        this.leftt_r2.cubeList.add(new ModelBox(leftt_r2, 12, 0, -0.01F, 0.0F, -0.5F, 0, 6, 1, 0.0F, false));

        this.bonele = new AdvancedModelRenderer(this);
        this.bonele.setRotationPoint(0.0F, 5.25F, -2.5F);
        this.lefte.addChild(bonele);


        this.leftb_r2 = new AdvancedModelRenderer(this);
        this.leftb_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bonele.addChild(leftb_r2);
        this.setRotateAngle(leftb_r2, -0.1745F, 0.0F, 0.0F);
        this.leftb_r2.cubeList.add(new ModelBox(leftb_r2, 12, 9, 0.0F, 0.0F, -0.2F, 0, 6, 1, 0.0F, false));

        this.righte = new AdvancedModelRenderer(this);
        this.righte.setRotationPoint(0.0F, -10.5F, 0.5F);
        this.bone4.addChild(righte);
        this.setRotateAngle(righte, 0.0F, 0.6109F, 0.0F);


        this.rightt_r2 = new AdvancedModelRenderer(this);
        this.rightt_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.righte.addChild(rightt_r2);
        this.setRotateAngle(rightt_r2, 0.3927F, 0.0F, 0.0F);
        this.rightt_r2.cubeList.add(new ModelBox(rightt_r2, 14, 0, 0.01F, 0.0F, -0.5F, 0, 6, 1, 0.0F, false));

        this.bonere = new AdvancedModelRenderer(this);
        this.bonere.setRotationPoint(0.0F, 5.25F, 2.5F);
        this.righte.addChild(bonere);


        this.rightb_r2 = new AdvancedModelRenderer(this);
        this.rightb_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bonere.addChild(rightb_r2);
        this.setRotateAngle(rightb_r2, 0.1745F, 0.0F, 0.0F);
        this.rightb_r2.cubeList.add(new ModelBox(rightb_r2, 14, 9, 0.0F, 0.05F, -0.8F, 0, 6, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.full.render(f5 * 0.38F);
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

        this.full.offsetY = 0.9F;

        AdvancedModelRenderer[] Righte = {this.righte, this.bonere};
        AdvancedModelRenderer[] Lefte = {this.lefte, this.bonele};
        AdvancedModelRenderer[] Flape = {this.east, this.lefte, this.bonele};

        AdvancedModelRenderer[] Rightw = {this.rightw, this.bonerw};
        AdvancedModelRenderer[] Leftw = {this.leftw, this.bonelw};
        AdvancedModelRenderer[] Flapw = {this.west, this.leftw, this.bonelw};

        float speed = 0.13F;
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled() && e.isInWater()) {
            this.swing(full, speed * 0.4F, 0.25F, true, 0, 0, f2, 0.6F);
            this.walk(full, speed * 0.3F, 0.4F, true, 0, 0, f2, 0.6F);
            this.flap(full, speed * 0.2F, 0.4F, true, 0, 0, f2, 0.6F);
            this.bob(full, -speed * 0.5F, 0.5F, false, f2, 0.6F);

            this.chainWave(Righte, 0.12F, 0.08F, 1F, f2, 0.5F);
            this.chainWave(Lefte, 0.12F, 0.08F, -1F, -f2, -0.5F);
            this.chainFlap(Flape, 0.12F, 0.08F, 1F, f2, 0.5F);

            this.chainWave(Rightw, 0.12F, 0.08F, 1F, f2, 0.5F);
            this.chainWave(Leftw, 0.12F, 0.08F, -1F, -f2, -0.5F);
            this.chainFlap(Flapw, 0.12F, 0.08F, 1F, f2, 0.5F);
            }
    }
}
