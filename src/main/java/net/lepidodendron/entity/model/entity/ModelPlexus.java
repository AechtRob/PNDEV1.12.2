package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraPlexus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelPlexus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer bone3;
    private final AdvancedModelRenderer bone4;
    private final AdvancedModelRenderer bone5;
    private final AdvancedModelRenderer bone6;
    private final AdvancedModelRenderer bone7;
    private final AdvancedModelRenderer bone8;
    private final AdvancedModelRenderer bone9;
    private final AdvancedModelRenderer bone10;
    private final AdvancedModelRenderer bone11;
    private final AdvancedModelRenderer bone12;
    private final AdvancedModelRenderer bone13;
    private final AdvancedModelRenderer bone14;
    private final AdvancedModelRenderer bone15;
    private final AdvancedModelRenderer bone16;
    private final AdvancedModelRenderer bone17;
    private final AdvancedModelRenderer bone18;
    private final AdvancedModelRenderer bone19;
    private final AdvancedModelRenderer bone20;
    private final AdvancedModelRenderer bone21;
    private final AdvancedModelRenderer bone22;

    public ModelPlexus() {
        textureWidth = 16;
        textureHeight = 16;

        bone = new AdvancedModelRenderer(this);
        bone.setRotationPoint(0.0F, 24.0F, 19.0F);
        bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -2.0F, -2.0F, 2, 2, 2, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 12, -1.0F, -2.0F, -1.0F, 2, 2, 2, -0.01F, false));

        bone2 = new AdvancedModelRenderer(this);
        bone2.setRotationPoint(1.5F, -1.0F, 0.0F);
        bone.addChild(bone2);
        bone2.cubeList.add(new ModelBox(bone2, 0, 8, -2.5F, -1.0F, -4.0F, 2, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 4, -2.5F, -1.0F, -3.0F, 2, 2, 2, -0.01F, false));

        bone3 = new AdvancedModelRenderer(this);
        bone3.setRotationPoint(2.0F, 0.0F, 0.0F);
        bone2.addChild(bone3);
        bone3.cubeList.add(new ModelBox(bone3, 0, 0, -4.5F, -1.0F, -6.0F, 2, 2, 2, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 0, 12, -4.5F, -1.0F, -5.0F, 2, 2, 2, -0.01F, false));

        bone4 = new AdvancedModelRenderer(this);
        bone4.setRotationPoint(2.0F, 0.0F, 0.0F);
        bone3.addChild(bone4);
        bone4.cubeList.add(new ModelBox(bone4, 0, 8, -6.5F, -1.0F, -8.0F, 2, 2, 2, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 0, 4, -6.5F, -1.0F, -7.0F, 2, 2, 2, -0.01F, false));

        bone5 = new AdvancedModelRenderer(this);
        bone5.setRotationPoint(2.0F, 0.0F, 0.0F);
        bone4.addChild(bone5);
        bone5.cubeList.add(new ModelBox(bone5, 0, 0, -8.5F, -1.0F, -10.0F, 2, 2, 2, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 0, 12, -8.5F, -1.0F, -9.0F, 2, 2, 2, -0.01F, false));

        bone6 = new AdvancedModelRenderer(this);
        bone6.setRotationPoint(2.0F, 0.0F, 0.0F);
        bone5.addChild(bone6);
        bone6.cubeList.add(new ModelBox(bone6, 0, 8, -10.5F, -1.0F, -12.0F, 2, 2, 2, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 0, 4, -10.5F, -1.0F, -11.0F, 2, 2, 2, -0.01F, false));

        bone7 = new AdvancedModelRenderer(this);
        bone7.setRotationPoint(2.0F, 0.0F, 0.0F);
        bone6.addChild(bone7);
        bone7.cubeList.add(new ModelBox(bone7, 0, 0, -12.5F, -1.0F, -14.0F, 2, 2, 2, 0.0F, false));
        bone7.cubeList.add(new ModelBox(bone7, 0, 12, -12.5F, -1.0F, -13.0F, 2, 2, 2, -0.01F, false));

        bone8 = new AdvancedModelRenderer(this);
        bone8.setRotationPoint(2.0F, 0.0F, 0.0F);
        bone7.addChild(bone8);
        bone8.cubeList.add(new ModelBox(bone8, 0, 8, -14.5F, -1.0F, -16.0F, 2, 2, 2, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 0, 4, -14.5F, -1.0F, -15.0F, 2, 2, 2, -0.01F, false));

        bone9 = new AdvancedModelRenderer(this);
        bone9.setRotationPoint(2.0F, 0.0F, 0.0F);
        bone8.addChild(bone9);
        bone9.cubeList.add(new ModelBox(bone9, 0, 0, -16.5F, -1.0F, -18.0F, 2, 2, 2, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 0, 12, -16.5F, -1.0F, -17.0F, 2, 2, 2, -0.01F, false));

        bone10 = new AdvancedModelRenderer(this);
        bone10.setRotationPoint(2.0F, 0.0F, 0.0F);
        bone9.addChild(bone10);
        bone10.cubeList.add(new ModelBox(bone10, 0, 8, -18.5F, -1.0F, -20.0F, 2, 2, 2, 0.0F, false));
        bone10.cubeList.add(new ModelBox(bone10, 0, 4, -18.5F, -1.0F, -19.0F, 2, 2, 2, -0.01F, false));

        bone11 = new AdvancedModelRenderer(this);
        bone11.setRotationPoint(2.0F, 0.0F, 0.0F);
        bone10.addChild(bone11);
        bone11.cubeList.add(new ModelBox(bone11, 0, 0, -20.5F, -1.0F, -22.0F, 2, 2, 2, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 0, 12, -20.5F, -1.0F, -21.0F, 2, 2, 2, -0.01F, false));

        bone12 = new AdvancedModelRenderer(this);
        bone12.setRotationPoint(2.0F, 0.0F, 0.0F);
        bone11.addChild(bone12);
        bone12.cubeList.add(new ModelBox(bone12, 0, 8, -22.5F, -1.0F, -24.0F, 2, 2, 2, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 0, 4, -22.5F, -1.0F, -23.0F, 2, 2, 2, -0.01F, false));

        bone13 = new AdvancedModelRenderer(this);
        bone13.setRotationPoint(2.0F, 0.0F, 0.0F);
        bone12.addChild(bone13);
        bone13.cubeList.add(new ModelBox(bone13, 0, 0, -24.5F, -1.0F, -26.0F, 2, 2, 2, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 0, 12, -24.5F, -1.0F, -25.0F, 2, 2, 2, -0.01F, false));

        bone14 = new AdvancedModelRenderer(this);
        bone14.setRotationPoint(2.0F, 0.0F, 0.0F);
        bone13.addChild(bone14);
        bone14.cubeList.add(new ModelBox(bone14, 0, 8, -26.5F, -1.0F, -28.0F, 2, 2, 2, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 0, 4, -26.5F, -1.0F, -27.0F, 2, 2, 2, -0.01F, false));

        bone15 = new AdvancedModelRenderer(this);
        bone15.setRotationPoint(2.0F, 0.0F, 0.0F);
        bone14.addChild(bone15);
        bone15.cubeList.add(new ModelBox(bone15, 0, 0, -28.5F, -1.0F, -30.0F, 2, 2, 2, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 0, 12, -28.5F, -1.0F, -29.0F, 2, 2, 2, -0.01F, false));

        bone16 = new AdvancedModelRenderer(this);
        bone16.setRotationPoint(2.0F, 0.0F, 0.0F);
        bone15.addChild(bone16);
        bone16.cubeList.add(new ModelBox(bone16, 0, 8, -30.5F, -1.0F, -32.0F, 2, 2, 2, 0.0F, false));
        bone16.cubeList.add(new ModelBox(bone16, 0, 4, -30.5F, -1.0F, -31.0F, 2, 2, 2, -0.01F, false));

        bone17 = new AdvancedModelRenderer(this);
        bone17.setRotationPoint(2.0F, 0.0F, 0.0F);
        bone16.addChild(bone17);
        bone17.cubeList.add(new ModelBox(bone17, 0, 0, -32.5F, -1.0F, -34.0F, 2, 2, 2, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 0, 12, -32.5F, -1.0F, -33.0F, 2, 2, 2, -0.01F, false));

        bone18 = new AdvancedModelRenderer(this);
        bone18.setRotationPoint(2.0F, 0.0F, 0.0F);
        bone17.addChild(bone18);
        bone18.cubeList.add(new ModelBox(bone18, 0, 8, -34.5F, -1.0F, -36.0F, 2, 2, 2, 0.0F, false));
        bone18.cubeList.add(new ModelBox(bone18, 0, 4, -34.5F, -1.0F, -35.0F, 2, 2, 2, -0.01F, false));

        bone19 = new AdvancedModelRenderer(this);
        bone19.setRotationPoint(2.0F, 0.0F, 0.0F);
        bone18.addChild(bone19);
        bone19.cubeList.add(new ModelBox(bone19, 0, 0, -36.5F, -1.0F, -38.0F, 2, 2, 2, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 0, 12, -36.5F, -1.0F, -37.0F, 2, 2, 2, -0.01F, false));

        bone20 = new AdvancedModelRenderer(this);
        bone20.setRotationPoint(2.0F, 0.0F, 0.0F);
        bone19.addChild(bone20);
        bone20.cubeList.add(new ModelBox(bone20, 0, 8, -38.5F, -1.0F, -40.0F, 2, 2, 2, 0.0F, false));
        bone20.cubeList.add(new ModelBox(bone20, 0, 4, -38.5F, -1.0F, -39.0F, 2, 2, 2, -0.01F, false));

        bone21 = new AdvancedModelRenderer(this);
        bone21.setRotationPoint(2.0F, 0.0F, 0.0F);
        bone20.addChild(bone21);
        bone21.cubeList.add(new ModelBox(bone21, 0, 0, -40.5F, -1.0F, -42.0F, 2, 2, 2, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 0, 12, -40.5F, -1.0F, -41.0F, 2, 2, 2, -0.01F, false));

        bone22 = new AdvancedModelRenderer(this);
        bone22.setRotationPoint(2.0F, 0.0F, 0.0F);
        bone21.addChild(bone22);
        bone22.cubeList.add(new ModelBox(bone22, 0, 8, -42.5F, -1.0F, -44.0F, 2, 2, 2, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 0, 4, -42.5F, -1.0F, -43.0F, 2, 2, 2, -0.01F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bone.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        //super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        AdvancedModelRenderer[] BodyF = {this.bone, this.bone2, this.bone3, this.bone4, this.bone5, this.bone6, this.bone7, this.bone8, this.bone9, this.bone10, this.bone11};
        AdvancedModelRenderer[] BodyB = {this.bone12, this.bone13, this.bone14, this.bone15, this.bone16, this.bone17, this.bone18, this.bone19, this.bone20, this.bone21, this.bone22};
        AdvancedModelRenderer[] BodyFull = {this.bone, this.bone2, this.bone3, this.bone4, this.bone5, this.bone6, this.bone7, this.bone8, this.bone9, this.bone10, this.bone11, this.bone12, this.bone13, this.bone14, this.bone15, this.bone16, this.bone17, this.bone18, this.bone19, this.bone20, this.bone21, this.bone22};

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(BodyFull, 0.2F, -0.015F, -4, f2, 0.4F);
            this.chainSwing(BodyF, 0.2F, 0.085F, 4, f2, 0.5F);
            this.chainSwing(BodyB, 0.2F, -0.085F, -4, f2, 0.5F);
            EntityPrehistoricFloraPlexus ee = (EntityPrehistoricFloraPlexus) e;
            this.bone.scaleChildren = true;
            float scaler = ((float)(((double)ee.getSlitherStage())/10D) * 0.08F) + 1F;
            this.bone.setScaleZ(scaler);
        }
    }
}
