package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelPteraspis extends AdvancedModelBase {
    public AdvancedModelRenderer Headback;
    public AdvancedModelRenderer Headmiddle;
    public AdvancedModelRenderer Headslope;
    public AdvancedModelRenderer Tail1;
    public AdvancedModelRenderer Leftpectoralwing1;
    public AdvancedModelRenderer Rightpectoralwing1;
    public AdvancedModelRenderer Headfront;
    public AdvancedModelRenderer Frontspike1;
    public AdvancedModelRenderer Backspike1;
    public AdvancedModelRenderer Frontspike2;
    public AdvancedModelRenderer Frontspike3;
    public AdvancedModelRenderer Backspike2;
    public AdvancedModelRenderer Tail2;
    public AdvancedModelRenderer Dorsalspine1;
    public AdvancedModelRenderer Dorsalspine2;
    public AdvancedModelRenderer Tail3;
    public AdvancedModelRenderer Dorsalspine3;
    public AdvancedModelRenderer Tail4;
    public AdvancedModelRenderer Tail5;
    public AdvancedModelRenderer Tail6;
    public AdvancedModelRenderer Tailfin1;
    public AdvancedModelRenderer Tailfin2;
    public AdvancedModelRenderer Leftpectoralwing2;
    public AdvancedModelRenderer Rightpectoralwing2;

    public ModelPteraspis() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Frontspike3 = new AdvancedModelRenderer(this, 35, 44);
        this.Frontspike3.setRotationPoint(0.0F, -0.8999999761581421F, -2.0F);
        this.Frontspike3.addBox(-0.5F, -1.0F, -2.0F, 1, 1, 2, 0.0F);
        this.Dorsalspine2 = new AdvancedModelRenderer(this, 1, 0);
        this.Dorsalspine2.setRotationPoint(0.0F, -0.8500000238418579F, 2.8499999046325684F);
        this.Dorsalspine2.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Dorsalspine2, 0.5731661290180989F, 0.0F, 0.0F);
        this.Tail5 = new AdvancedModelRenderer(this, 0, 14);
        this.Tail5.setRotationPoint(0.0F, 0.30000001192092896F, 2.700000047683716F);
        this.Tail5.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(Tail5, -0.21223203437934937F, 0.0F, 0.0F);
        this.Leftpectoralwing1 = new AdvancedModelRenderer(this, 13, 29);
        this.Leftpectoralwing1.setRotationPoint(0.5F, 1.3F, -0.26F);
        this.Leftpectoralwing1.addBox(1.0F, -0.5F, -1.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(Leftpectoralwing1, 0.0F, 0.551873109480607F, 0.12740903539558604F);
        this.Tail3 = new AdvancedModelRenderer(this, 0, 26);
        this.Tail3.setRotationPoint(0.0F, 0.30000001192092896F, 3.5F);
        this.Tail3.addBox(-1.5F, -1.0F, -0.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(Tail3, -0.04241150198859518F, 0.0F, 0.0F);
        this.Tail2 = new AdvancedModelRenderer(this, 0, 33);
        this.Tail2.setRotationPoint(0.0F, 0.25F, 3.299999952316284F);
        this.Tail2.addBox(-2.0F, -1.0F, -0.5F, 4, 4, 4, 0.0F);
        this.setRotateAngle(Tail2, -0.04241150198859518F, 0.0F, 0.0F);
        this.Tail6 = new AdvancedModelRenderer(this, 0, 6);
        this.Tail6.setRotationPoint(-0.009999999776482582F, 0.0F, 3.799999952316284F);
        this.Tail6.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F);
        this.setRotateAngle(Tail6, 0.4457571069383183F, 0.0F, 0.0F);
        this.Backspike1 = new AdvancedModelRenderer(this, 16, 40);
        this.Backspike1.setRotationPoint(0.0F, 0.0F, -3.6F);
        this.Backspike1.addBox(-0.5F, -4.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(Backspike1, -1.167450736659007F, 0.0F, 0.0F);
        this.Rightpectoralwing1 = new AdvancedModelRenderer(this, 13, 23);
        this.Rightpectoralwing1.setRotationPoint(-0.5F, 1.3F, -0.26F);
        this.Rightpectoralwing1.addBox(-3.0F, -0.5F, -1.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(Rightpectoralwing1, 0.0F, -0.551873109480607F, -0.12740903539558604F);
        this.Dorsalspine3 = new AdvancedModelRenderer(this, 6, 0);
        this.Dorsalspine3.setRotationPoint(0.0F, -0.8500000238418579F, 1.5F);
        this.Dorsalspine3.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Dorsalspine3, 0.5731661290180989F, 0.0F, 0.0F);
        this.Tail1 = new AdvancedModelRenderer(this, 0, 42);
        this.Tail1.setRotationPoint(0.009999999776482582F, -0.10000000149011612F, 1.899999976158142F);
        this.Tail1.addBox(-2.5F, -1.0F, -0.5F, 5, 5, 4, 0.0F);
        this.setRotateAngle(Tail1, -0.021293017373673524F, 0.0F, 0.0F);
        this.Dorsalspine1 = new AdvancedModelRenderer(this, 11, 0);
        this.Dorsalspine1.setRotationPoint(0.0F, -0.8500000238418579F, 1.2999999523162842F);
        this.Dorsalspine1.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Dorsalspine1, 0.5731661290180989F, 0.0F, 0.0F);
        this.Tailfin2 = new AdvancedModelRenderer(this, 9, 0);
        this.Tailfin2.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.Tailfin2.addBox(0.0F, -4.0F, 0.0F, 0, 4, 5, 0.0F);
        this.setRotateAngle(Tailfin2, -0.1485275233394591F, 0.0F, 0.0F);
        this.Tailfin1 = new AdvancedModelRenderer(this, 15, 6);
        this.Tailfin1.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.Tailfin1.addBox(0.0F, -4.0F, 0.0F, 0, 4, 4, 0.0F);
        this.setRotateAngle(Tailfin1, 0.21223203437934937F, 0.0F, 0.0F);
        this.Frontspike2 = new AdvancedModelRenderer(this, 30, 40);
        this.Frontspike2.setRotationPoint(0.0F, 2.0999999046325684F, -5.0F);
        this.Frontspike2.addBox(-0.5F, -2.0F, -2.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(Frontspike2, -0.021293017373673524F, 0.0F, 0.0F);
        this.Headback = new AdvancedModelRenderer(this, 0, 52);
        this.Headback.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Headback.addBox(-3.5F, -1.0F, -5.0F, 7, 5, 7, 0.0F);
        this.Frontspike1 = new AdvancedModelRenderer(this, 20, 40);
        this.Frontspike1.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.Frontspike1.addBox(-1.0F, 0.0F, -5.0F, 2, 3, 5, 0.0F);
        this.setRotateAngle(Frontspike1, -0.1872738207495083F, 0.0F, 0.0F);
        this.Backspike2 = new AdvancedModelRenderer(this, 17, 35);
        this.Backspike2.setRotationPoint(0.009999999776482582F, -4.0F, 0.0F);
        this.Backspike2.addBox(-0.5F, -3.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Backspike2, -0.12740903872453743F, 0.0F, 0.0F);
        this.Headfront = new AdvancedModelRenderer(this, 29, 57);
        this.Headfront.setRotationPoint(0.0F, -3.799999952316284F, -3.0F);
        this.Headfront.addBox(-2.0F, 0.0F, -2.0F, 4, 3, 2, 0.0F);
        this.setRotateAngle(Headfront, 0.040666170239887334F, 0.0F, 0.0F);
        this.Leftpectoralwing2 = new AdvancedModelRenderer(this, 16, 17);
        this.Leftpectoralwing2.setRotationPoint(3.0F, 0.009999999776482582F, 3.0F);
        this.Leftpectoralwing2.addBox(-2.0F, -0.5F, 0.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(Leftpectoralwing2, 0.0F, -0.5094616179782085F, 0.0F);
        this.Rightpectoralwing2 = new AdvancedModelRenderer(this, 16, 20);
        this.Rightpectoralwing2.setRotationPoint(-3.0F, 0.009999999776482582F, 3.0F);
        this.Rightpectoralwing2.addBox(0.0F, -0.5F, 0.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(Rightpectoralwing2, 0.0F, 0.5094616179782085F, 0.0F);
        this.Tail4 = new AdvancedModelRenderer(this, 0, 20);
        this.Tail4.setRotationPoint(0.0F, 0.30000001192092896F, 2.0F);
        this.Tail4.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(Tail4, 0.06370451936226872F, 0.0F, 0.0F);
        this.Headmiddle = new AdvancedModelRenderer(this, 22, 49);
        this.Headmiddle.setRotationPoint(0.0F, 3.5F, -5.0F);
        this.Headmiddle.addBox(-3.0F, -4.0F, -3.0F, 6, 4, 3, 0.0F);
        this.setRotateAngle(Headmiddle, -0.06370451936226872F, 0.0F, 0.0F);
        this.Headslope = new AdvancedModelRenderer(this, 33, 54);
        this.Headslope.setRotationPoint(0.0F, -2.0F, 1.899999976158142F);
        this.Headslope.addBox(-2.5F, 0.0F, -9.0F, 5, 1, 9, 0.0F);
        this.setRotateAngle(Headslope, 0.12356930970961799F, 0.0F, 0.0F);
        this.Frontspike2.addChild(this.Frontspike3);
        this.Tail1.addChild(this.Dorsalspine2);
        this.Tail4.addChild(this.Tail5);
        this.Headback.addChild(this.Leftpectoralwing1);
        this.Tail2.addChild(this.Tail3);
        this.Tail1.addChild(this.Tail2);
        this.Tail5.addChild(this.Tail6);
        this.Headslope.addChild(this.Backspike1);
        this.Headback.addChild(this.Rightpectoralwing1);
        this.Tail2.addChild(this.Dorsalspine3);
        this.Headback.addChild(this.Tail1);
        this.Tail1.addChild(this.Dorsalspine1);
        this.Tail6.addChild(this.Tailfin2);
        this.Tail5.addChild(this.Tailfin1);
        this.Frontspike1.addChild(this.Frontspike2);
        this.Headslope.addChild(this.Frontspike1);
        this.Backspike1.addChild(this.Backspike2);
        this.Headmiddle.addChild(this.Headfront);
        this.Leftpectoralwing1.addChild(this.Leftpectoralwing2);
        this.Rightpectoralwing1.addChild(this.Rightpectoralwing2);
        this.Tail3.addChild(this.Tail4);
        this.Headback.addChild(this.Headmiddle);
        this.Headback.addChild(this.Headslope);

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Headback.render(f5 * 0.3F);
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
        this.Headback.offsetY = 1.4F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4, this.Tail5, this.Tail6};
        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.4F, -3, f2, 0.8F);
            this.swing(Headback, speed, 0.3F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                this.Headback.rotateAngleZ = (float) Math.toRadians(90);
                this.Headback.offsetY = 1.4F;
                this.bob(Headback, -speed, 5F, false, f2, 1);
            }
        }
    }
}
