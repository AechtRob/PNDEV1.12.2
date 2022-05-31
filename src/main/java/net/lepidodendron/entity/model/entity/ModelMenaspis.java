package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelMenaspis extends AdvancedModelBase {
    public AdvancedModelRenderer Bodyfront;
    public AdvancedModelRenderer Head;
    public AdvancedModelRenderer Bodymiddle;
    public AdvancedModelRenderer Leftpectoralfin;
    public AdvancedModelRenderer Rightpectoralfin;
    public AdvancedModelRenderer Dorsalspinesfront;
    public AdvancedModelRenderer Snoutbase;
    public AdvancedModelRenderer Lowerjawbase;
    public AdvancedModelRenderer Snoutmiddle;
    public AdvancedModelRenderer Lefthindfacespine;
    public AdvancedModelRenderer Righthindfacespine;
    public AdvancedModelRenderer Leftmouthprocessbase;
    public AdvancedModelRenderer Rightmouthprocessbase;
    public AdvancedModelRenderer Snoutfront;
    public AdvancedModelRenderer Leftmiddlespine;
    public AdvancedModelRenderer Leftfrontspine;
    public AdvancedModelRenderer Rightmiddlespine;
    public AdvancedModelRenderer Rightfrontspine;
    public AdvancedModelRenderer Leftmouthprocess;
    public AdvancedModelRenderer Rightmouthprocess;
    public AdvancedModelRenderer Lowerjawmiddle;
    public AdvancedModelRenderer Lowerjawfront;
    public AdvancedModelRenderer Bodyend;
    public AdvancedModelRenderer Dorsalspinesmiddle;
    public AdvancedModelRenderer Tailbase;
    public AdvancedModelRenderer Leftpelvicfin;
    public AdvancedModelRenderer Rightpelvicfin;
    public AdvancedModelRenderer Dorsalspinesend;
    public AdvancedModelRenderer Tailmiddle;
    public AdvancedModelRenderer Dorsalspine;
    public AdvancedModelRenderer Tailend;
    public AdvancedModelRenderer Tailfin;

    public ModelMenaspis() {
        this.textureWidth = 100;
        this.textureHeight = 100;
        this.Tailbase = new AdvancedModelRenderer(this, 0, 38);
        this.Tailbase.setRotationPoint(0.0F, 0.30000001192092896F, 4.400000095367432F);
        this.Tailbase.addBox(-1.5F, -1.5F, 0.0F, 3, 4, 4, 0.0F);
        this.setRotateAngle(Tailbase, 0.10611601718967469F, 0.0F, 0.0F);
        this.Rightpelvicfin = new AdvancedModelRenderer(this, 13, 25);
        this.Rightpelvicfin.setRotationPoint(-1.75F, 3.5F, 2.0F);
        this.Rightpelvicfin.addBox(-4.0F, 0.0F, -0.5F, 4, 0, 6, 0.0F);
        this.setRotateAngle(Rightpelvicfin, 0.10611601718967469F, 0.06370451936226872F, -0.21223203437934937F);
        this.Dorsalspinesend = new AdvancedModelRenderer(this, 14, 2);
        this.Dorsalspinesend.setRotationPoint(0.0F, -1.0F, 1.399999976158142F);
        this.Dorsalspinesend.addBox(0.0F, -1.0F, 0.0F, 0, 1, 3, 0.0F);
        this.Bodyend = new AdvancedModelRenderer(this, 0, 47);
        this.Bodyend.setRotationPoint(0.0F, 0.0F, 3.200000047683716F);
        this.Bodyend.addBox(-2.0F, -1.5F, 0.0F, 4, 5, 5, 0.0F);
        this.setRotateAngle(Bodyend, 0.10611601718967469F, 0.0F, 0.0F);
        this.Head = new AdvancedModelRenderer(this, 0, 89);
        this.Head.setRotationPoint(0.0F, -1.5F, 0.5F);
        this.Head.addBox(-4.5F, 0.0F, -5.0F, 9, 6, 5, 0.0F);
        this.setRotateAngle(Head, 0.1911135497644277F, 0.0F, 0.0F);
        this.Leftpelvicfin = new AdvancedModelRenderer(this, 15, 3);
        this.Leftpelvicfin.setRotationPoint(1.75F, 3.5F, 2.0F);
        this.Leftpelvicfin.addBox(0.0F, 0.0F, -0.5F, 4, 0, 6, 0.0F);
        this.setRotateAngle(Leftpelvicfin, 0.10611601718967469F, -0.06370451936226872F, 0.21223203437934937F);
        this.Snoutbase = new AdvancedModelRenderer(this, 0, 68);
        this.Snoutbase.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Snoutbase.addBox(-3.0F, 0.0F, -4.0F, 6, 4, 4, 0.0F);
        this.setRotateAngle(Snoutbase, 0.36093409463874954F, 0.0F, 0.0F);
        this.Tailfin = new AdvancedModelRenderer(this, 43, 25);
        this.Tailfin.setRotationPoint(0.0F, 0.5F, 0.5F);
        this.Tailfin.addBox(0.0F, -2.0F, 0.0F, 0, 4, 8, 0.0F);
        this.setRotateAngle(Tailfin, -0.04241150198859518F, 0.0F, 0.0F);
        this.Lowerjawfront = new AdvancedModelRenderer(this, 21, 50);
        this.Lowerjawfront.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.Lowerjawfront.addBox(-1.5F, -1.0F, -1.0F, 3, 1, 1, 0.0F);
        this.Snoutmiddle = new AdvancedModelRenderer(this, 19, 65);
        this.Snoutmiddle.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Snoutmiddle.addBox(-2.0F, 0.0F, -3.0F, 4, 3, 3, 0.0F);
        this.setRotateAngle(Snoutmiddle, 0.31834805156902407F, 0.0F, 0.0F);
        this.Rightfrontspine = new AdvancedModelRenderer(this, 24, 7);
        this.Rightfrontspine.setRotationPoint(-1.5F, -0.10000000149011612F, -2.0F);
        this.Rightfrontspine.addBox(-6.0F, 0.0F, 0.0F, 6, 0, 6, 0.0F);
        this.setRotateAngle(Rightfrontspine, -0.8278096695472326F, -0.06370451936226872F, 0.12740903872453743F);
        this.Rightmouthprocessbase = new AdvancedModelRenderer(this, 34, 46);
        this.Rightmouthprocessbase.setRotationPoint(-2.5F, 2.0F, -4.0F);
        this.Rightmouthprocessbase.addBox(-6.0F, -2.0F, 0.0F, 8, 2, 6, 0.0F);
        this.setRotateAngle(Rightmouthprocessbase, -1.018923235956417F, 0.5518731241279929F, -0.7641051252178287F);
        this.Leftmouthprocess = new AdvancedModelRenderer(this, 59, 61);
        this.Leftmouthprocess.setRotationPoint(6.0F, -0.30000001192092896F, 0.0F);
        this.Leftmouthprocess.addBox(0.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F);
        this.setRotateAngle(Leftmouthprocess, 0.0F, -0.23352505591421208F, 0.0F);
        this.Leftfrontspine = new AdvancedModelRenderer(this, 29, 18);
        this.Leftfrontspine.setRotationPoint(1.75F, -0.10000000149011612F, -2.0F);
        this.Leftfrontspine.addBox(0.0F, 0.0F, 0.0F, 6, 0, 6, 0.0F);
        this.setRotateAngle(Leftfrontspine, -0.8278096695472326F, 0.06370451936226872F, -0.12740903872453743F);
        this.Leftpectoralfin = new AdvancedModelRenderer(this, 41, 19);
        this.Leftpectoralfin.setRotationPoint(3.5F, 4.5F, 0.0F);
        this.Leftpectoralfin.addBox(0.0F, 0.0F, -1.0F, 7, 0, 11, 0.0F);
        this.setRotateAngle(Leftpectoralfin, 0.021293017373673524F, -0.08482300397719036F, 0.08482300397719036F);
        this.Dorsalspine = new AdvancedModelRenderer(this, 0, 0);
        this.Dorsalspine.setRotationPoint(0.0F, -1.0F, 0.8999999761581421F);
        this.Dorsalspine.addBox(0.0F, -1.0F, 0.0F, 0, 1, 1, 0.0F);
        this.Leftmiddlespine = new AdvancedModelRenderer(this, 49, 34);
        this.Leftmiddlespine.setRotationPoint(1.5F, -0.10000000149011612F, -1.0F);
        this.Leftmiddlespine.addBox(0.0F, 0.0F, 0.0F, 6, 0, 11, 0.0F);
        this.setRotateAngle(Leftmiddlespine, -0.7216936190680444F, -0.04241150198859518F, -0.10611601718967469F);
        this.Bodyfront = new AdvancedModelRenderer(this, 0, 77);
        this.Bodyfront.setRotationPoint(0.0F, 18.0F, 0.0F);
        this.Bodyfront.addBox(-4.0F, -1.5F, 0.0F, 8, 6, 5, 0.0F);
        this.setRotateAngle(Bodyfront, -0.04241150082346221F, 0.0F, 0.0F);
        this.Leftmouthprocessbase = new AdvancedModelRenderer(this, 36, 58);
        this.Leftmouthprocessbase.setRotationPoint(2.5F, 2.0F, -4.0F);
        this.Leftmouthprocessbase.addBox(-2.0F, -2.0F, 0.0F, 8, 2, 6, 0.0F);
        this.setRotateAngle(Leftmouthprocessbase, -1.018923235956417F, -0.5518731241279929F, 0.7641051252178287F);
        this.Snoutfront = new AdvancedModelRenderer(this, 0, 18);
        this.Snoutfront.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Snoutfront.addBox(-2.0F, 0.0F, -1.0F, 4, 2, 1, 0.0F);
        this.setRotateAngle(Snoutfront, -0.7429866572476639F, 0.0F, 0.0F);
        this.Rightpectoralfin = new AdvancedModelRenderer(this, 36, 2);
        this.Rightpectoralfin.setRotationPoint(-3.5F, 4.5F, 0.0F);
        this.Rightpectoralfin.addBox(-7.0F, 0.0F, -1.0F, 7, 0, 11, 0.0F);
        this.setRotateAngle(Rightpectoralfin, 0.021293017373673524F, 0.08482300397719036F, -0.08482300397719036F);
        this.Lowerjawbase = new AdvancedModelRenderer(this, 18, 56);
        this.Lowerjawbase.setRotationPoint(0.0F, 6.199999809265137F, -5.699999809265137F);
        this.Lowerjawbase.addBox(-3.0F, -1.0F, -4.0F, 6, 1, 4, 0.0F);
        this.setRotateAngle(Lowerjawbase, -0.06370451936226872F, 0.0F, 0.0F);
        this.Lefthindfacespine = new AdvancedModelRenderer(this, 18, 18);
        this.Lefthindfacespine.setRotationPoint(1.2999999523162842F, 0.0F, -2.5999999046325684F);
        this.Lefthindfacespine.addBox(0.0F, 0.0F, 0.0F, 4, 0, 4, 0.0F);
        this.setRotateAngle(Lefthindfacespine, -0.1911135497644277F, -0.38205256260891435F, -0.38205256260891435F);
        this.Righthindfacespine = new AdvancedModelRenderer(this, 15, 11);
        this.Righthindfacespine.setRotationPoint(-1.2999999523162842F, 0.0F, -2.5999999046325684F);
        this.Righthindfacespine.addBox(-4.0F, 0.0F, 0.0F, 4, 0, 4, 0.0F);
        this.setRotateAngle(Righthindfacespine, -0.1911135497644277F, 0.38205256260891435F, 0.38205256260891435F);
        this.Lowerjawmiddle = new AdvancedModelRenderer(this, 19, 53);
        this.Lowerjawmiddle.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Lowerjawmiddle.addBox(-2.5F, -1.0F, -1.0F, 5, 1, 1, 0.0F);
        this.setRotateAngle(Lowerjawmiddle, -0.12740903872453743F, 0.0F, 0.0F);
        this.Rightmouthprocess = new AdvancedModelRenderer(this, 57, 49);
        this.Rightmouthprocess.setRotationPoint(-6.0F, -0.30000001192092896F, 0.0F);
        this.Rightmouthprocess.addBox(-3.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F);
        this.setRotateAngle(Rightmouthprocess, 0.0F, 0.23352505591421208F, 0.0F);
        this.Tailmiddle = new AdvancedModelRenderer(this, 0, 30);
        this.Tailmiddle.setRotationPoint(0.0F, -0.10000000149011612F, 3.5F);
        this.Tailmiddle.addBox(-1.0F, -1.0F, 0.0F, 2, 3, 4, 0.0F);
        this.setRotateAngle(Tailmiddle, 0.10611601718967469F, 0.0F, 0.0F);
        this.Rightmiddlespine = new AdvancedModelRenderer(this, 66, 17);
        this.Rightmiddlespine.setRotationPoint(-1.5F, -0.10000000149011612F, -1.0F);
        this.Rightmiddlespine.addBox(-6.0F, 0.0F, 0.0F, 6, 0, 11, 0.0F);
        this.setRotateAngle(Rightmiddlespine, -0.7216936190680444F, 0.04241150198859518F, 0.10611601718967469F);
        this.Dorsalspinesmiddle = new AdvancedModelRenderer(this, 8, 1);
        this.Dorsalspinesmiddle.setRotationPoint(0.0F, -1.0F, 0.800000011920929F);
        this.Dorsalspinesmiddle.addBox(0.0F, -1.0F, 0.0F, 0, 1, 3, 0.0F);
        this.Tailend = new AdvancedModelRenderer(this, 0, 22);
        this.Tailend.setRotationPoint(0.0F, -0.4000000059604645F, 3.5F);
        this.Tailend.addBox(-0.5F, -0.5F, 0.0F, 1, 2, 5, 0.0F);
        this.setRotateAngle(Tailend, -0.04241150198859518F, 0.0F, 0.0F);
        this.Bodymiddle = new AdvancedModelRenderer(this, 0, 58);
        this.Bodymiddle.setRotationPoint(0.0F, 0.10000000149011612F, 4.400000095367432F);
        this.Bodymiddle.addBox(-3.0F, -1.5F, 0.0F, 6, 5, 4, 0.0F);
        this.setRotateAngle(Bodymiddle, -0.1485275233394591F, 0.0F, 0.0F);
        this.Dorsalspinesfront = new AdvancedModelRenderer(this, 2, 0);
        this.Dorsalspinesfront.setRotationPoint(0.0F, -0.800000011920929F, 2.0F);
        this.Dorsalspinesfront.addBox(0.0F, -1.0F, 0.0F, 0, 1, 3, 0.0F);
        this.setRotateAngle(Dorsalspinesfront, 0.04241150198859518F, 0.0F, 0.0F);
        this.Bodyend.addChild(this.Tailbase);
        this.Bodyend.addChild(this.Rightpelvicfin);
        this.Bodyend.addChild(this.Dorsalspinesend);
        this.Bodymiddle.addChild(this.Bodyend);
        this.Bodyfront.addChild(this.Head);
        this.Bodyend.addChild(this.Leftpelvicfin);
        this.Head.addChild(this.Snoutbase);
        this.Tailend.addChild(this.Tailfin);
        this.Lowerjawmiddle.addChild(this.Lowerjawfront);
        this.Snoutbase.addChild(this.Snoutmiddle);
        this.Snoutmiddle.addChild(this.Rightfrontspine);
        this.Snoutmiddle.addChild(this.Rightmouthprocessbase);
        this.Leftmouthprocessbase.addChild(this.Leftmouthprocess);
        this.Snoutmiddle.addChild(this.Leftfrontspine);
        this.Bodyfront.addChild(this.Leftpectoralfin);
        this.Tailbase.addChild(this.Dorsalspine);
        this.Snoutmiddle.addChild(this.Leftmiddlespine);
        this.Snoutmiddle.addChild(this.Leftmouthprocessbase);
        this.Snoutmiddle.addChild(this.Snoutfront);
        this.Bodyfront.addChild(this.Rightpectoralfin);
        this.Head.addChild(this.Lowerjawbase);
        this.Snoutbase.addChild(this.Lefthindfacespine);
        this.Snoutbase.addChild(this.Righthindfacespine);
        this.Lowerjawbase.addChild(this.Lowerjawmiddle);
        this.Rightmouthprocessbase.addChild(this.Rightmouthprocess);
        this.Tailbase.addChild(this.Tailmiddle);
        this.Snoutmiddle.addChild(this.Rightmiddlespine);
        this.Bodymiddle.addChild(this.Dorsalspinesmiddle);
        this.Tailmiddle.addChild(this.Tailend);
        this.Bodyfront.addChild(this.Bodymiddle);
        this.Bodyfront.addChild(this.Dorsalspinesfront);

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Bodyfront.render(f5 * 0.2F);
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

        AdvancedModelRenderer[] finLeft = {this.Leftpectoralfin};
        AdvancedModelRenderer[] finRight = {this.Rightpectoralfin};
        AdvancedModelRenderer[] fishTail = {this.Bodymiddle, this.Bodyend, this.Tailbase, this.Tailmiddle, this.Tailend};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.5F, -3, f2, 1);
            this.swing(Bodyfront, speed, 0.3F, true, 0, 0, f2, 1);
            this.walk(Lowerjawbase, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);

            this.walk(Leftpectoralfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(Leftpectoralfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.chainFlap(finLeft, speed, -0.30F, -0.8, f2, 1);

            this.walk(Rightpectoralfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(Rightpectoralfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.chainFlap(finRight, speed, 0.30F, 0.8, f2, 1);

            this.walk(Leftpelvicfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(Leftpelvicfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(Leftpelvicfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);

            this.walk(Rightpelvicfin, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            this.swing(Rightpelvicfin, (float) (speed * 0.75), -0.2F, true, 3, 0, f2, 1);
            this.flap(Rightpelvicfin, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);

            this.walk(Leftmiddlespine, (float) (speed * 1.25), 0.2F, false, 0, 0, f2, 1);
            this.walk(Leftmiddlespine, (float) (speed * 1.25), 0.2F, false, 1, 0, f2, 1);
            this.walk(Lefthindfacespine, (float) (speed * 1.25), 0.2F, false, 2, 0, f2, 1);

            this.walk(Rightmiddlespine, (float) (speed * 1.25), 0.2F, false, 0, 0, f2, 1);
            this.walk(Rightmiddlespine, (float) (speed * 1.25), 0.2F, false, 1, 0, f2, 1);
            this.walk(Righthindfacespine, (float) (speed * 1.25), 0.2F, false, 2, 0, f2, 1);

            this.swing(Leftmiddlespine, (float) (speed * 1.25), 0.2F, false, 0, 0, f2, 1);
            this.swing(Leftmiddlespine, (float) (speed * 1.25), 0.2F, false, 1, 0, f2, 1);
            this.swing(Lefthindfacespine, (float) (speed * 1.25), 0.2F, false, 2, 0, f2, 1);

            this.swing(Rightmiddlespine, (float) (speed * 1.25), -0.2F, false, 0, 0, f2, 1);
            this.swing(Rightmiddlespine, (float) (speed * 1.25), -0.2F, false, 1, 0, f2, 1);
            this.swing(Righthindfacespine, (float) (speed * 1.25), -0.2F, false, 2, 0, f2, 1);


            if (!e.isInWater()) {
                this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.Bodyfront.offsetY = 1.25F;
                this.bob(Bodyfront, -speed, 5F, false, f2, 1);
            }
        }
    }
}
