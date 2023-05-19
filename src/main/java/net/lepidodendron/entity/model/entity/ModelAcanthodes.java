package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelAcanthodes extends AdvancedModelBase {
    public AdvancedModelRenderer Bodyfront;
    public AdvancedModelRenderer Gills;
    public AdvancedModelRenderer Bodymiddle;
    public AdvancedModelRenderer Leftpectoralfin;
    public AdvancedModelRenderer Rightpectoralfin;
    public AdvancedModelRenderer Head;
    public AdvancedModelRenderer Lowerjaw;
    public AdvancedModelRenderer Tail1;
    public AdvancedModelRenderer Back1;
    public AdvancedModelRenderer Belly1;
    public AdvancedModelRenderer Tail2;
    public AdvancedModelRenderer Back2;
    public AdvancedModelRenderer Belly2;
    public AdvancedModelRenderer Tail3;
    public AdvancedModelRenderer Belly3;
    public AdvancedModelRenderer Dorsalfin;
    public AdvancedModelRenderer Tailfin;
    public AdvancedModelRenderer Analfin;
    public AdvancedModelRenderer Leftpelvicfin;
    public AdvancedModelRenderer Rightpelvicfin;

    public ModelAcanthodes() {
        this.textureWidth = 100;
        this.textureHeight = 100;
        this.Head = new AdvancedModelRenderer(this, 34, 34);
        this.Head.setRotationPoint(0.009999999776482582F, -1.899999976158142F, -1.5F);
        this.Head.addBox(-2.5F, -1.0F, -9.0F, 5, 5, 10, 0.0F);
        this.setRotateAngle(Head, 0.21223203437934937F, 0.0F, 0.0F);
        this.Bodymiddle = new AdvancedModelRenderer(this, 10, 34);
        this.Bodymiddle.setRotationPoint(0.0F, 2.5F, 2.299999952316284F);
        this.Bodymiddle.addBox(-2.0F, -2.5F, 0.0F, 4, 5, 15, 0.0F);
        this.setRotateAngle(Bodymiddle, 0.008726646259971648F, 0.0F, 0.0F);
        this.Back2 = new AdvancedModelRenderer(this, 19, 18);
        this.Back2.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.Back2.addBox(-1.0F, -1.0F, 0.0F, 2, 1, 9, 0.0F);
        this.setRotateAngle(Back2, -0.081157811882212F, 0.0F, 0.0F);
        this.Tail3 = new AdvancedModelRenderer(this, 0, 1);
        this.Tail3.setRotationPoint(0.0F, -0.4000000059604645F, 10.5F);
        this.Tail3.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 15, 0.0F);
        this.setRotateAngle(Tail3, 0.15725416959943073F, 0.0F, 0.0F);
        this.Belly3 = new AdvancedModelRenderer(this, 18, 0);
        this.Belly3.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Belly3.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 11, 0.0F);
        this.setRotateAngle(Belly3, 0.08482300397719036F, 0.0F, 0.0F);
        this.Tailfin = new AdvancedModelRenderer(this, 49, 7);
        this.Tailfin.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.Tailfin.addBox(0.0F, 0.0F, 0.0F, 0, 8, 15, 0.0F);
        this.Gills = new AdvancedModelRenderer(this, 23, 55);
        this.Gills.setRotationPoint(0.0F, 2.0999999046325684F, -7.199999809265137F);
        this.Gills.addBox(-3.0F, -1.5F, -5.0F, 6, 5, 6, 0.0F);
        this.setRotateAngle(Gills, -0.12740903872453743F, 0.0F, 0.0F);
        this.Belly1 = new AdvancedModelRenderer(this, 40, 0);
        this.Belly1.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.Belly1.addBox(-1.5F, 0.0F, 0.0F, 3, 1, 15, 0.0F);
        this.setRotateAngle(Belly1, 0.03193952606051029F, 0.0F, 0.0F);
        this.Bodyfront = new AdvancedModelRenderer(this, 0, 55);
        this.Bodyfront.setRotationPoint(0.0F, 15.0F, -3.0F);
        this.Bodyfront.addBox(-2.5F, -1.0F, -9.0F, 5, 7, 12, 0.0F);
        this.Belly2 = new AdvancedModelRenderer(this, 32, 0);
        this.Belly2.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Belly2.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 9, 0.0F);
        this.setRotateAngle(Belly2, 0.08988445814218365F, 0.0F, 0.0F);
        this.Rightpelvicfin = new AdvancedModelRenderer(this, 54, 26);
        this.Rightpelvicfin.setRotationPoint(-0.699999988079071F, 1.0F, 4.0F);
        this.Rightpelvicfin.addBox(0.0F, 0.0F, 0.0F, 0, 4, 13, 0.0F);
        this.setRotateAngle(Rightpelvicfin, 0.06370451936226872F, 0.0F, 0.7641051252178287F);
        this.Tail1 = new AdvancedModelRenderer(this, 0, 33);
        this.Tail1.setRotationPoint(0.0F, 0.0F, 14.5F);
        this.Tail1.addBox(-1.5F, -2.0F, 0.0F, 3, 4, 9, 0.0F);
        this.setRotateAngle(Tail1, 0.03525565055739032F, 0.0F, 0.0F);
        this.Leftpelvicfin = new AdvancedModelRenderer(this, 54, 21);
        this.Leftpelvicfin.setRotationPoint(0.699999988079071F, 1.0F, 4.0F);
        this.Leftpelvicfin.addBox(0.0F, 0.0F, 0.0F, 0, 4, 13, 0.0F);
        this.setRotateAngle(Leftpelvicfin, 0.06370451936226872F, 0.0F, -0.7641051252178287F);
        this.Lowerjaw = new AdvancedModelRenderer(this, 42, 49);
        this.Lowerjaw.setRotationPoint(0.0F, 2.0F, -2.4000000953674316F);
        this.Lowerjaw.addBox(-2.0F, 0.0F, -7.0F, 4, 2, 9, 0.0F);
        this.setRotateAngle(Lowerjaw, 0.4F, 0.0F, 0.0F);
        this.Dorsalfin = new AdvancedModelRenderer(this, 68, 12);
        this.Dorsalfin.setRotationPoint(0.0F, -1.0F, 5.5F);
        this.Dorsalfin.addBox(0.0F, -4.0F, 0.0F, 0, 4, 5, 0.0F);
        this.Back1 = new AdvancedModelRenderer(this, 27, 17);
        this.Back1.setRotationPoint(0.0F, -2.5F, 0.0F);
        this.Back1.addBox(-1.5F, -1.0F, 0.0F, 3, 1, 15, 0.0F);
        this.setRotateAngle(Back1, -0.03176499330175842F, 0.0F, 0.0F);
        this.Leftpectoralfin = new AdvancedModelRenderer(this, 53, 50);
        this.Leftpectoralfin.setRotationPoint(2.5F, 5.5F, -7.0F);
        this.Leftpectoralfin.addBox(0.0F, 0.0F, 0.0F, 8, 0, 6, 0.0F);
        this.setRotateAngle(Leftpectoralfin, 0.10611601718967469F, -0.4457571069383183F, 0.42446406875869874F);
        this.Tail2 = new AdvancedModelRenderer(this, 0, 18);
        this.Tail2.setRotationPoint(0.0F, -1.0F, 8.199999809265137F);
        this.Tail2.addBox(-1.0F, -1.0F, 0.0F, 2, 3, 11, 0.0F);
        this.setRotateAngle(Tail2, 0.05113814824856683F, 0.0F, 0.0F);
        this.Rightpectoralfin = new AdvancedModelRenderer(this, 42, 61);
        this.Rightpectoralfin.setRotationPoint(-2.5F, 5.5F, -7.0F);
        this.Rightpectoralfin.addBox(-8.0F, 0.0F, 0.0F, 8, 0, 6, 0.0F);
        this.setRotateAngle(Rightpectoralfin, 0.10611601718967469F, 0.4457571069383183F, -0.42446406875869874F);
        this.Analfin = new AdvancedModelRenderer(this, 49, 8);
        this.Analfin.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.Analfin.addBox(0.0F, 0.0F, 0.0F, 0, 4, 9, 0.0F);
        this.Gills.addChild(this.Head);
        this.Bodyfront.addChild(this.Bodymiddle);
        this.Tail1.addChild(this.Back2);
        this.Tail2.addChild(this.Tail3);
        this.Tail2.addChild(this.Belly3);
        this.Tail3.addChild(this.Tailfin);
        this.Bodyfront.addChild(this.Gills);
        this.Bodymiddle.addChild(this.Belly1);
        this.Tail1.addChild(this.Belly2);
        this.Belly1.addChild(this.Rightpelvicfin);
        this.Bodymiddle.addChild(this.Tail1);
        this.Belly1.addChild(this.Leftpelvicfin);
        this.Gills.addChild(this.Lowerjaw);
        this.Tail2.addChild(this.Dorsalfin);
        this.Bodymiddle.addChild(this.Back1);
        this.Bodyfront.addChild(this.Leftpectoralfin);
        this.Tail1.addChild(this.Tail2);
        this.Bodyfront.addChild(this.Rightpectoralfin);
        this.Belly3.addChild(this.Analfin);

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Bodyfront.render(f5 * 0.15F);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Bodyfront.rotateAngleY = (float) Math.toRadians(90);
        this.Bodyfront.render(0.01F);
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
        this.Bodyfront.offsetY = 1.1F;

        if (e instanceof EntityLiving) {
            if (((EntityLiving)e).isAIDisabled()) {
                return;
            }
        }

        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Tail1, this.Tail2, this.Tail3};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed * 2, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.5F, -3, f2, 1);
            this.swing(Bodyfront, speed, 0.3F, true, 0, 0, f2, 1);
            this.walk(Lowerjaw, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(Leftpectoralfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(Leftpectoralfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(Rightpectoralfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(Rightpectoralfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.Bodyfront.offsetY = 1.25F;
                this.bob(Bodyfront, -speed, 5F, false, f2, 1);
            }
        }
    }
}
