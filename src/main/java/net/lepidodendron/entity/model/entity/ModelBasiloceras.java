package net.lepidodendron.entity.model.entity;

import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBasiloceras extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended body2;
    private final AdvancedModelRendererExtended smallestshell_r1;
    private final AdvancedModelRendererExtended asmallershellthanthateven_r1;
    private final AdvancedModelRendererExtended evensmallershell_r1;
    private final AdvancedModelRendererExtended smallershell_r1;
    private final AdvancedModelRendererExtended mainshell_r1;
    private final AdvancedModelRendererExtended lefteye_r1;
    private final AdvancedModelRendererExtended hood_r1;
    private final AdvancedModelRendererExtended bottomhalfshell_r1;
    private final AdvancedModelRendererExtended head_r1;
    private final AdvancedModelRendererExtended siphon_r1;
    private final AdvancedModelRendererExtended top3;
    private final AdvancedModelRendererExtended low3;
    private final AdvancedModelRendererExtended top6;
    private final AdvancedModelRendererExtended low6;
    private final AdvancedModelRendererExtended top2;
    private final AdvancedModelRendererExtended low2;
    private final AdvancedModelRendererExtended top7;
    private final AdvancedModelRendererExtended low7;
    private final AdvancedModelRendererExtended top8;
    private final AdvancedModelRendererExtended low8;
    private final AdvancedModelRendererExtended top5;
    private final AdvancedModelRendererExtended low5;
    private final AdvancedModelRendererExtended top9;
    private final AdvancedModelRendererExtended low9;
    private final AdvancedModelRendererExtended top10;
    private final AdvancedModelRendererExtended low10;
    private final AdvancedModelRendererExtended top;
    private final AdvancedModelRendererExtended low;
    private final AdvancedModelRendererExtended top4;
    private final AdvancedModelRendererExtended low4;

    public ModelBasiloceras() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 24.25F, -1.0F);


        this.body2 = new AdvancedModelRendererExtended(this);
        this.body2.setRotationPoint(0.5F, -59.0F, -1.85F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.0873F, 0.0F, 0.0F);


        this.smallestshell_r1 = new AdvancedModelRendererExtended(this);
        this.smallestshell_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body2.addChild(smallestshell_r1);
        this.setRotateAngle(smallestshell_r1, 0.7418F, 0.0F, 0.0F);
        this.smallestshell_r1.cubeList.add(new ModelBox(smallestshell_r1, 7, 8, -1.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F, false));

        this.asmallershellthanthateven_r1 = new AdvancedModelRendererExtended(this);
        this.asmallershellthanthateven_r1.setRotationPoint(0.0F, 4.75F, 3.5F);
        this.body2.addChild(asmallershellthanthateven_r1);
        this.setRotateAngle(asmallershellthanthateven_r1, 0.6109F, 0.0F, 0.0F);
        this.asmallershellthanthateven_r1.cubeList.add(new ModelBox(asmallershellthanthateven_r1, 27, 33, -2.0F, -6.0F, -2.0F, 3, 6, 3, 0.0F, false));

        this.evensmallershell_r1 = new AdvancedModelRendererExtended(this);
        this.evensmallershell_r1.setRotationPoint(0.0F, 10.75F, 4.5F);
        this.body2.addChild(evensmallershell_r1);
        this.setRotateAngle(evensmallershell_r1, 0.2618F, 0.0F, 0.0F);
        this.evensmallershell_r1.cubeList.add(new ModelBox(evensmallershell_r1, 44, 14, -3.0F, -8.0F, -3.0F, 5, 8, 5, 0.0F, false));

        this.smallershell_r1 = new AdvancedModelRendererExtended(this);
        this.smallershell_r1.setRotationPoint(0.0F, 17.75F, 5.5F);
        this.body2.addChild(smallershell_r1);
        this.setRotateAngle(smallershell_r1, 0.1309F, 0.0F, 0.0F);
        this.smallershell_r1.cubeList.add(new ModelBox(smallershell_r1, 36, 36, -5.0F, -8.0F, -4.0F, 9, 8, 8, 0.0F, false));

        this.mainshell_r1 = new AdvancedModelRendererExtended(this);
        this.mainshell_r1.setRotationPoint(0.0F, 38.75F, 4.5F);
        this.body2.addChild(mainshell_r1);
        this.setRotateAngle(mainshell_r1, -0.0436F, 0.0F, 0.0F);
        this.mainshell_r1.cubeList.add(new ModelBox(mainshell_r1, 0, 0, -6.0F, -22.0F, -5.0F, 11, 22, 11, 0.0F, false));

        this.lefteye_r1 = new AdvancedModelRendererExtended(this);
        this.lefteye_r1.setRotationPoint(-4.5F, 41.75F, 4.5F);
        this.body2.addChild(lefteye_r1);
        this.setRotateAngle(lefteye_r1, 0.0873F, 0.0F, 0.0F);
        this.lefteye_r1.cubeList.add(new ModelBox(lefteye_r1, 0, 33, -1.0F, -3.0F, -1.0F, 1, 3, 3, 0.0F, false));
        this.lefteye_r1.cubeList.add(new ModelBox(lefteye_r1, 33, 0, 8.0F, -3.0F, -1.0F, 1, 3, 3, 0.0F, false));

        this.hood_r1 = new AdvancedModelRendererExtended(this);
        this.hood_r1.setRotationPoint(3.5F, 42.75F, -2.5F);
        this.body2.addChild(hood_r1);
        this.setRotateAngle(hood_r1, -0.0436F, 0.0F, 0.0F);
        this.hood_r1.cubeList.add(new ModelBox(hood_r1, 0, 51, -8.0F, -7.0F, 2.0F, 8, 8, 2, 0.0F, false));

        this.bottomhalfshell_r1 = new AdvancedModelRendererExtended(this);
        this.bottomhalfshell_r1.setRotationPoint(3.5F, 40.0F, 15.5F);
        this.body2.addChild(bottomhalfshell_r1);
        this.setRotateAngle(bottomhalfshell_r1, 0.0873F, 0.0F, 0.0F);
        this.bottomhalfshell_r1.cubeList.add(new ModelBox(bottomhalfshell_r1, 44, 0, -9.0F, -8.0F, -8.0F, 10, 10, 4, 0.0F, false));

        this.head_r1 = new AdvancedModelRendererExtended(this);
        this.head_r1.setRotationPoint(3.0F, 41.75F, 6.5F);
        this.body2.addChild(head_r1);
        this.setRotateAngle(head_r1, 0.0873F, 0.0F, 0.0F);
        this.head_r1.cubeList.add(new ModelBox(head_r1, 0, 33, -8.0F, -7.0F, -6.0F, 9, 9, 9, 0.0F, false));

        this.siphon_r1 = new AdvancedModelRendererExtended(this);
        this.siphon_r1.setRotationPoint(-0.5F, 45.75F, 10.5F);
        this.body2.addChild(siphon_r1);
        this.setRotateAngle(siphon_r1, 0.3927F, 0.0F, 0.0F);
        this.siphon_r1.cubeList.add(new ModelBox(siphon_r1, 0, 0, -1.0F, -7.0F, 0.0F, 2, 7, 2, 0.0F, false));

        this.top3 = new AdvancedModelRendererExtended(this);
        this.top3.setRotationPoint(-2.0F, -14.85F, -3.5F);
        this.body.addChild(top3);
        this.setRotateAngle(top3, -0.1745F, 0.1745F, 0.1745F);
        this.top3.cubeList.add(new ModelBox(top3, 36, 52, -0.5F, -0.6936F, -0.4981F, 1, 8, 1, 0.0F, true));

        this.low3 = new AdvancedModelRendererExtended(this);
        this.low3.setRotationPoint(0.0F, 7.35F, 0.0F);
        this.top3.addChild(low3);
        this.low3.cubeList.add(new ModelBox(low3, 56, 27, -0.49F, -0.0641F, -0.5166F, 1, 6, 1, 0.0F, true));

        this.top6 = new AdvancedModelRendererExtended(this);
        this.top6.setRotationPoint(-2.0F, -14.85F, 2.5F);
        this.body.addChild(top6);
        this.setRotateAngle(top6, -0.1745F, 2.9671F, 0.1745F);
        this.top6.cubeList.add(new ModelBox(top6, 40, 52, -0.5F, -0.6936F, -0.5019F, 1, 8, 1, 0.0F, true));

        this.low6 = new AdvancedModelRendererExtended(this);
        this.low6.setRotationPoint(0.0F, 7.35F, 0.0F);
        this.top6.addChild(low6);
        this.low6.cubeList.add(new ModelBox(low6, 52, 59, -0.49F, -0.0641F, -0.4834F, 1, 6, 1, 0.0F, true));

        this.top2 = new AdvancedModelRendererExtended(this);
        this.top2.setRotationPoint(2.0F, -14.85F, -3.5F);
        this.body.addChild(top2);
        this.setRotateAngle(top2, -0.1745F, -0.1745F, -0.1745F);
        this.top2.cubeList.add(new ModelBox(top2, 36, 52, -0.5F, -0.6936F, -0.4981F, 1, 8, 1, 0.0F, false));

        this.low2 = new AdvancedModelRendererExtended(this);
        this.low2.setRotationPoint(0.0F, 7.35F, 0.0F);
        this.top2.addChild(low2);
        this.low2.cubeList.add(new ModelBox(low2, 56, 27, -0.51F, -0.0641F, -0.5166F, 1, 6, 1, 0.0F, false));

        this.top7 = new AdvancedModelRendererExtended(this);
        this.top7.setRotationPoint(3.0F, -14.85F, -1.5F);
        this.body.addChild(top7);
        this.setRotateAngle(top7, -0.0873F, 0.1745F, -0.3491F);
        this.top7.cubeList.add(new ModelBox(top7, 36, 52, -0.5F, -0.6936F, -0.4981F, 1, 8, 1, 0.0F, false));

        this.low7 = new AdvancedModelRendererExtended(this);
        this.low7.setRotationPoint(0.0F, 7.35F, 0.0F);
        this.top7.addChild(low7);
        this.low7.cubeList.add(new ModelBox(low7, 56, 27, -0.51F, -0.0641F, -0.5166F, 1, 6, 1, 0.0F, false));

        this.top8 = new AdvancedModelRendererExtended(this);
        this.top8.setRotationPoint(-3.0F, -14.85F, -1.5F);
        this.body.addChild(top8);
        this.setRotateAngle(top8, -0.0873F, -0.1745F, 0.3491F);
        this.top8.cubeList.add(new ModelBox(top8, 36, 52, -0.5F, -0.6936F, -0.4981F, 1, 8, 1, 0.0F, true));

        this.low8 = new AdvancedModelRendererExtended(this);
        this.low8.setRotationPoint(0.0F, 7.35F, 0.0F);
        this.top8.addChild(low8);
        this.low8.cubeList.add(new ModelBox(low8, 56, 27, -0.49F, -0.0641F, -0.5166F, 1, 6, 1, 0.0F, true));

        this.top5 = new AdvancedModelRendererExtended(this);
        this.top5.setRotationPoint(2.0F, -14.85F, 2.5F);
        this.body.addChild(top5);
        this.setRotateAngle(top5, -0.1745F, -2.9671F, -0.1745F);
        this.top5.cubeList.add(new ModelBox(top5, 40, 52, -0.5F, -0.6936F, -0.5019F, 1, 8, 1, 0.0F, false));

        this.low5 = new AdvancedModelRendererExtended(this);
        this.low5.setRotationPoint(0.0F, 7.35F, 0.0F);
        this.top5.addChild(low5);
        this.low5.cubeList.add(new ModelBox(low5, 52, 59, -0.51F, -0.0641F, -0.4834F, 1, 6, 1, 0.0F, false));

        this.top9 = new AdvancedModelRendererExtended(this);
        this.top9.setRotationPoint(3.0F, -14.85F, 0.5F);
        this.body.addChild(top9);
        this.setRotateAngle(top9, -0.0873F, 2.9671F, -0.3491F);
        this.top9.cubeList.add(new ModelBox(top9, 40, 52, -0.5F, -0.6936F, -0.5019F, 1, 8, 1, 0.0F, false));

        this.low9 = new AdvancedModelRendererExtended(this);
        this.low9.setRotationPoint(0.0F, 7.35F, 0.0F);
        this.top9.addChild(low9);
        this.low9.cubeList.add(new ModelBox(low9, 52, 59, -0.51F, -0.0641F, -0.4834F, 1, 6, 1, 0.0F, false));

        this.top10 = new AdvancedModelRendererExtended(this);
        this.top10.setRotationPoint(-3.0F, -14.85F, 0.5F);
        this.body.addChild(top10);
        this.setRotateAngle(top10, -0.0873F, -2.9671F, 0.3491F);
        this.top10.cubeList.add(new ModelBox(top10, 40, 52, -0.5F, -0.6936F, -0.5019F, 1, 8, 1, 0.0F, true));

        this.low10 = new AdvancedModelRendererExtended(this);
        this.low10.setRotationPoint(0.0F, 7.35F, 0.0F);
        this.top10.addChild(low10);
        this.low10.cubeList.add(new ModelBox(low10, 52, 59, -0.49F, -0.0641F, -0.4834F, 1, 6, 1, 0.0F, true));

        this.top = new AdvancedModelRendererExtended(this);
        this.top.setRotationPoint(0.0F, -14.85F, -3.5F);
        this.body.addChild(top);
        this.setRotateAngle(top, -0.3491F, 0.0F, 0.0F);
        this.top.cubeList.add(new ModelBox(top, 44, 52, -0.5F, -0.6936F, -0.4981F, 1, 8, 1, 0.0F, false));

        this.low = new AdvancedModelRendererExtended(this);
        this.low.setRotationPoint(0.0F, 7.35F, 0.0F);
        this.top.addChild(low);
        this.low.cubeList.add(new ModelBox(low, 48, 59, -0.51F, -0.0641F, -0.5166F, 1, 6, 1, 0.0F, false));

        this.top4 = new AdvancedModelRendererExtended(this);
        this.top4.setRotationPoint(0.0F, -14.85F, 2.5F);
        this.body.addChild(top4);
        this.setRotateAngle(top4, -0.3491F, 3.1416F, 0.0F);
        this.top4.cubeList.add(new ModelBox(top4, 44, 52, -0.5F, -0.6936F, -0.5019F, 1, 8, 1, 0.0F, false));

        this.low4 = new AdvancedModelRendererExtended(this);
        this.low4.setRotationPoint(0.0F, 7.35F, 0.0F);
        this.top4.addChild(low4);
        this.low4.cubeList.add(new ModelBox(low4, 48, 59, -0.51F, -0.0641F, -0.4834F, 1, 6, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.25F);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = 0.05F;
        this.body.offsetX = 0.0F;
        this.body.offsetZ = 1.8F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(1);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 0.3F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.2F, 3.8F, -0.0F);
        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();

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
        //this.body.offsetY = 1.2F;

        AdvancedModelRendererExtended[] tentacle1 = {this.top, this.low};
        AdvancedModelRendererExtended[] tentacle2 = {this.top2, this.low2};
        AdvancedModelRendererExtended[] tentacle3 = {this.top3, this.low3};
        AdvancedModelRendererExtended[] tentacle4 = {this.top4, this.low4};
        AdvancedModelRendererExtended[] tentacle5 = {this.top5, this.low5};
        AdvancedModelRendererExtended[] tentacle6 = {this.top6, this.low6};
        AdvancedModelRendererExtended[] tentacle7 = {this.top7, this.low7};
        AdvancedModelRendererExtended[] tentacle8 = {this.top8, this.low8};
        AdvancedModelRendererExtended[] tentacle9 = {this.top9, this.low9};
        AdvancedModelRendererExtended[] tentacle10 = {this.top10, this.low10};

        float speed = 0.15F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }

        this.chainWave(tentacle1, speed, -0.3F, -2, f2, 1F);
        this.chainWave(tentacle4, speed, -0.3F, -2, f2, 1F);

        this.chainWave(tentacle2, speed, -0.3F * 0.7F, -2, f2, 1F);
        this.chainWave(tentacle3, speed, -0.3F * 0.7F, -2, f2, 1F);
        this.chainFlap(tentacle2, speed, 0.3F * 0.7F, -2, f2, 1F);
        this.chainFlap(tentacle3, speed, -0.3F * 0.7F, -2, f2, 1F);

        this.chainWave(tentacle5, speed, -0.3F * 0.7F, -2, f2, 1F);
        this.chainWave(tentacle6, speed, -0.3F * 0.7F, -2, f2, 1F);
        this.chainFlap(tentacle5, speed, 0.3F * 0.7F, -2, f2, 1F);
        this.chainFlap(tentacle6, speed, -0.3F * 0.7F, -2, f2, 1F);

        this.chainFlap(tentacle10, speed, -0.3F, -2, f2, 1F);
        this.chainFlap(tentacle8, speed, -0.3F, -2, f2, 1F);

        this.chainFlap(tentacle7, speed, 0.3F, -2, f2, 1F);
        this.chainFlap(tentacle9, speed, 0.3F, -2, f2, 1F);

        if (e.isInWater()) {
            this.bob(body, speed, 3.0F, false, f2, 2);
            this.flap(body, speed*0.5F, 0.06F, false, 0, 0, f2, 2);
            this.walk(body, speed*0.5F, 0.06F, false, 0, 0, f2, 2);
            this.body.offsetY = this.moveBoxExtended(speed, 0.2F, false, 3, f2, 1) + 1.1F;
        }
        else {
            this.body.rotateAngleZ = (float) Math.toRadians(90);
            this.body.offsetY = 1.05F;
        }

    }

}
